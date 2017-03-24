package multiThread;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
	public static void main(String args[]){
		final Exchanger<String> e = new Exchanger<String>();
		new Thread(new Runnable(){
			@Override
			public void run() {
				String str1 = "string1";
				try {
					String str2 = e.exchange(str1);
					System.out.println(str2);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable(){
			@Override
			public void run() {
				String str2 = "string2";
				try {
					String str1 = e.exchange(str2);
					System.out.println(str1);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}).start();
	}
}
