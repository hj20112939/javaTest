package dateTest;

public class JVM189 {
	private int width = 3;
	//constructor1
	JVM189(){
		this(1);
		System.out.println("JVM189(),width=" + width);
	}
  //constructor2
	JVM189(int width){
		this.width = width;
		System.out.println("JVM189(int width),width = " + width);
	}
  //constructor3
	JVM189(String msg){
		super();
		System.out.println("JVM189(String msg),width  = " + width);
		System.out.println(msg);
	}
	public static void main(String args[]){
		String msg = "This is a JVM test1";
		JVM189 one = new JVM189();
		JVM189 two = new JVM189(2);
		JVM189 three = new JVM189(msg);
	}
}
