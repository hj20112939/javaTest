package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator{
	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();
	public int next(){
		lock.lock();
		try{
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		}finally{
			lock.unlock();
		}
	}
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
	}
}
