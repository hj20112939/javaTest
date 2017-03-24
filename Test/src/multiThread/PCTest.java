package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Customer implements Runnable {
	private PublicResouce resource;
	private String name;

	public Customer(PublicResouce resource, String name) {
		this.resource = resource;
		this.name = name;
	}

	public void run() {
		try {
			resource.decreace(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable {
	private PublicResouce resource;
	private String name;

	public Producer(PublicResouce resource, String name) {
		this.resource = resource;
		this.name = name;
	}

	public void run() {
		try {
			resource.increace(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class PublicResouce {
	private int number = 0;

	public void increace(String name) throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (number >= 10) {
						try {
							System.out.println("等待消耗资源");
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				} else {
						number++;
						System.out.println(name + "生产资源！剩余资源：" + number);
						if (number > 0) {
							notifyAll();
						}
						Thread.sleep(1000);
					}
			}
		}
	}

	public void decreace(String name) throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (number <= 0) {
					try {
						System.out.println("等待生产资源");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					number--;
					System.out.println(name + "消费资源！剩余资源：" + number);
					if (number < 10) {
						notifyAll();
					}
					Thread.sleep(1000);
				}
			}
		}
	}
}

public class PCTest {
	public static void main(String args[]) {
		ExecutorService exec = Executors.newCachedThreadPool();
		PublicResouce resource = new PublicResouce();
		exec.execute(new Producer(resource, "producer1"));
		exec.execute(new Producer(resource, "producer2"));
		exec.execute(new Customer(resource, "customer1"));
		exec.execute(new Customer(resource, "customer2"));
		exec.shutdown();
	}
}
