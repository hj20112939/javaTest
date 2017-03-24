package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	public static void main(String args[]) {
		ExecutorService e = Executors.newFixedThreadPool(30);
		final Semaphore s = new Semaphore(10);
		for (int i = 0; i < 20; i++) {
			e.execute(new Runnable() {
				public void run() {
					try {
						s.acquire();
						System.out.println(Thread.currentThread().getName());
						Thread.currentThread().sleep(1000);
						s.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
