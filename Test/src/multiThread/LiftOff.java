package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
  protected int countDown = 10;
  private static int taskCount = 0;
  private final int id = taskCount++;
  public LiftOff(){}
  public LiftOff(int countDown){
  	this.countDown = countDown;
  }
  public String status(){
  	return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "),";
  }
	@Override
	public void run() {
		while(countDown-- > 0){
			System.out.print(status());
			Thread.yield();
		}
	}
  public static void main(String args[]){
  	//LiftOff launch = new LiftOff();
  	//launch.run();
  	ExecutorService exec = Executors.newFixedThreadPool(5);
  	exec.execute(new LiftOff());
  	//new Thread(new LiftOff()).start();
  	//new Thread(new LiftOff()).start();
  	exec.shutdown();
  	ExecutorService exec1 = Executors.newSingleThreadExecutor();
  	exec1.submit(new LiftOff());
  	exec1.shutdown();
  }
}
