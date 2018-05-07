package Basic_Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Comparison {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date d1 = sdf.parse("22-03-2018");
		Date d2= sdf.parse("22-03-2018");
		
		System.out.println(d1.compareTo(d2));
		
		//date1<date 2 returns -1
		//date1 == date 2 returns 0
		//date1 > date 2 returns 1

	
	
	//also we can use calendar class and getTime method
	
	}
}