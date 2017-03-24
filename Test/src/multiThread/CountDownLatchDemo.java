package multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class CountDownLatchDemo {
	public static void main(String args[]) throws InterruptedException{
		final CountDownLatch c = new CountDownLatch(2);
  	new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println(1);
				c.countDown();
				System.out.println(2);
				c.countDown();
			}
  	}).start();
	  c.await();
	  System.out.println(3);
	}
}
