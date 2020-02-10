package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
	
		printDate(cal);
		
		cal.set(2007,11,13);
		cal.add(Calendar.DATE,5000);
		printDate(cal);
		
	}
	
	public static void printDate(Calendar cal) {
		
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH);
		
		int date = cal.get(Calendar.DATE);
		
		int hours = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out .println(year +"년"+( month+1)+"월"+date+"일"+hours+"시"+minutes+"분"+second+"초");;
		
	}

}
