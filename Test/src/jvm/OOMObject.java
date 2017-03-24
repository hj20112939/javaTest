package jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OOMObject {
	public byte[] placeholder = new byte[64*1024];
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i = 0;i < num;i++){
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	public static void createBusyThread(){
		Thread thread = new Thread(new Runnable(){
			public void run(){
				while(true);
			}
		},"testBusyThread");
		thread.start();
	}
	public static void createLockThread(final Object lock){
		Thread thread = new Thread(new Runnable(){
			public void run(){
				synchronized(lock){
					try{
						lock.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		},"testLockThread");
		thread.start();
	}
	public static void main(String[] args) throws Exception{
		//fillHeap(1000);
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		Object obj = new Object();
		createLockThread(obj);*/
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			int temp = iterator.next().intValue();
			System.out.println(temp);
			if(temp == 4)
				list.remove(4);
		}
		for(Integer i : list){
			System.out.println(i);
			if(i == 4){
				list.remove(i);
			}
		}
	}
}
