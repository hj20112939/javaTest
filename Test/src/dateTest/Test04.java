package dateTest;

public class Test04 {
	
	public static void main(String[] args) {
	  if (new Test04(){
	  	public boolean print(){
	  		System.out.print("a");
	    	return false;
	  	}}.print()) {
	  	System.out.print("a");
	  } else {
	  	System.out.print("b");
	  }
  }
}