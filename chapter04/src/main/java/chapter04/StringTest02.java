package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date now = new Date();
		printDate2(now);
		
		System.out.println(now);
				
	}
	
	public static void printDAte1(Date d) {
	
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String date= sdf.format(d);
			System.out.println(d);
	}
	
	public static void printDate2(Date d) {
		int year=d.getYear();
		int moth = d.getMonth();
		
		int date=d.getDate();
		int hours = d.getHours();
		
		int minutes =d.getMinutes();
		int seconds = d.getSeconds();
		
		
	}
	
	
	

}
