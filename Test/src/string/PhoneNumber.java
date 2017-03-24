package string;

public class PhoneNumber {
	public static void main(String args[]){
		String pattern = "1{1}[3,5,8]{1}[0-9]{9}";
		System.out.println("13074787629".matches(pattern));
	}
}
