package multiThread;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class MultiThread {
	public class returnFuture implements Callable<String> {
		Random rand = new Random();
		int min = rand.nextInt(1000);
		private String str;
		public returnFuture(String str){
			this.str = str;
		}
		@Override
		public String call() throws Exception {
			Thread.sleep(min);
			Singleton.instance().print(str + "，运行完成返回");
			return str + "，运行完成返回";
		}
		
	}
	public void testThread(){
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> resultFuture = new ArrayList<Future<String>>();
		for(int i =0; i< 100; i++){
			resultFuture.add(exec.submit(new returnFuture("线程编号" + i + "的线程")));
		}
		try {
			int doneCount = 0;
			ArrayList<String> list = new ArrayList<String>();
			do {
				for (Future<String> fs : resultFuture) {
					if (fs.isDone()) {
						if(!list.contains(fs.get())){
							list.add(fs.get());
							doneCount++;
							//Singleton.instance().print(fs.get());
						}
					} 
				}
			} while (doneCount < 100);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		exec.shutdown();
	}
	public static void main(String[] args){
		MultiThread m = new MultiThread();
		m.testThread();
	}
}
