package multiThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	public static void main(String args[]) throws InterruptedException, BrokenBarrierException{
		final CyclicBarrier c = new CyclicBarrier(5);
		for(int i = 0; i < 3;i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					System.out.println(1);
					try {
						c.await();
					} catch (InterruptedException | BrokenBarrierException e) {
						e.printStackTrace();
					}
				}
	  	}).start();
		}
		c.await();
		System.out.println(3);
	}
}
