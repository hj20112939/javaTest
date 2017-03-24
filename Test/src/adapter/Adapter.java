package adapter;

//目标角色
interface target {
	public void run();
}

//适配角色
class Adaptee {
	public void specificRun() {
		System.out.println("新加的功能");
	}
}

//适配器
class ClassAdapter extends Adaptee implements target {
	@Override
	public void run() {
		this.specificRun();
	}
}

//用户
public class Adapter {
	public static void main(String[] args) {
		ClassAdapter classAdapter = new ClassAdapter();
		classAdapter.run();
	}
}
