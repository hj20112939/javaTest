package multiThread;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallTest implements Callable<String>{
	@Override
	public String call() throws Exception {
		Thread t = Thread.currentThread();
		t.sleep(100);
		return String.valueOf(t.getName());
	}	
}
public class CallAndFuture {
	public static void main(String args[]) throws InterruptedException, ExecutionException{
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();
		ExecutorService exec = Executors.newCachedThreadPool();
		CallTest c1 = new CallTest();
		CallTest c2 = new CallTest();
		CallTest c3 = new CallTest();
		list.add(exec.submit(c1));
		list.add(exec.submit(c2));
		list.add(exec.submit(c3));
		exec.shutdown();
		int count = 0;
		do{
			count = 0;
			for(Future<String> f :list){
				if(f.isDone()){
					count++;
				}
			}
		}while(count < 3);
		for(Future<String> f :list){
			System.out.println(f.get());
		}
	}
}
