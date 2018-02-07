package com.pbdevj.advanced_future.inherited_class;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class DateAndCalendarTest
{

	public static void main(String[] args)
	{
//		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
//		System.out.println(calendar.getTime());
		
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		String dateStr = format.format(calendar.getTime());
		
		System.out.println(dateStr);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		
		
		
	}

}
