package dateTest;

class A1{
	public A1(int i){
		System.out.println("A:" + i);
	}
}
class B1{
	public B1(int i){
		System.out.println("B:" + i);
	}
}
public class C extends A1{
	private B1 b;
	public C(){
		super(1);
		b = new B1(2);
	}
  public static void main(String args[]){
  	C c = new C();
  }
}
