package dateTest;
class A{
	public static String str = "adb";
}
class B extends A{
	
}
public class StringAddress {
  public static void main(String[] args){
  	A.str = "r";
  	System.out.println(A.str);
  	System.out.println(B.str);

  }
}
