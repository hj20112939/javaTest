package dateTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
	private int i = 0;
	public test(int i){
		this.i = i;
	}
	public static void process(test obj){
		System.out.println(obj.i);
		obj = new test(99);
	  obj.i--;
	  System.out.println(obj.i);
	}
	public static void main(String[] args){
		String s1 = "ab123" ;  
    String s2 = new String( "ab123" ) ;  
    System.out.println( s1 == s2 );   
    String s3 = s2.intern() ;   
    System.out.println( s1 == s3 ) ; 
	}
}
