package com.dateEx;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH); //일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); //요일을 리턴
		int ampm = now.get(Calendar.AM_PM); //오전/오후 리턴
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		

		System.out.println("year "+year+"년");
		System.out.println("month "+month+"월");
		System.out.println("day "+day+"일");
		
//		System.out.println("week "+week);
		switch(week) {
		case Calendar.MONDAY :
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY :
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY :
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY :
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY :
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY :
			System.out.println("토요일");
			break;
		case Calendar.SUNDAY :
			System.out.println("일요일");
			break;
		}
		
//		System.out.println("ampm "+ampm);
		switch(ampm) {
		case Calendar.AM :
			System.out.println("AM");
			break;
		case Calendar.PM :
			System.out.println("PM");
			break;
		}
		
		System.out.println("hour "+hour+"시");
		System.out.println("minute "+minute+"분");
		System.out.println("second "+second+"초");
		
	}
	

	
	

}
