package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String args[]){
		/*SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
	  String now = df.format(new Date());
	  String startDate = now.substring(0,4) + "01";
		System.out.println(startDate + "\n" +now);*/
		String  str = "\"123.5.98.191\"";
		String[] temp = str.split("\\\"");
		str.replaceAll("\"","\\\\\""); 
		System.out.println(str.replaceAll("\"",""));
	}	
}
