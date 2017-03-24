package multiThread;


public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){}
	public static Singleton instance() {
		return singleton;
	}
	public void print(String s) throws InterruptedException{
		System.out.println(s);
	}
}
