package proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MyInvocationHandler implements InvocationHandler {
	private Object target;

	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("------------------before------------------");
		Object result = method.invoke(target, args);
		System.out.println("-------------------after------------------");
		return result;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread()
				.getContextClassLoader(), target.getClass().getInterfaces(), this);
	}
}

interface UserService {
	public void add();
}

class UserServiceImpl implements UserService {
	public void add() {
		System.out.println("--------------------add---------------");
	}
}

class ProxyServiceImpl implements UserService{
	private UserService userService;
	public ProxyServiceImpl(UserService userService){
		this.userService = userService;
	}
	public void add() {
		System.out.println("------------------before------------------");
		userService.add();
		System.out.println("-------------------after------------------");
	}
}
class ProxyClass extends MyInvocationHandler implements UserService{

	public ProxyClass(Object target) {
		super(target);
	}

	@Override
	public void add() {
		try {
			super.invoke(this, UserService.class.getMethod("add", null), null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}	
}
public class ProxyTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	/*	UserService userService = new UserServiceImpl();
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		UserService proxy = (UserService) invocationHandler.getProxy();
		proxy.add();
		UserService u = new UserServiceImpl();
		UserService uproxy = new ProxyServiceImpl(u);
		uproxy.add();*/
		Class<?> proxyClass = Proxy.getProxyClass(ProxyTest.class.getClassLoader(), UserService.class);
		Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
		InvocationHandler ih = new MyInvocationHandler(new UserServiceImpl());
		UserService user = (UserService)cons.newInstance(ih);
		user.add();
		String a = "test1";
		String b = new String("test1");
		String c = new String("te") + new String("st");
		System.out.println(a == c);
	}
}
