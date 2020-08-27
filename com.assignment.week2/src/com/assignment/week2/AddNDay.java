package com.assignment.week2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AddNDay {

	public void addTime() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day,month and year");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		System.out.println("enter day and month to add");
		int day2 = sc.nextInt();
		int month2 = sc.nextInt();
	   Calendar cal = new GregorianCalendar(year, month, day);


	      cal.add(Calendar.MONTH, month2);


	      cal.add(Calendar.DAY_OF_MONTH, day2);


	     SimpleDateFormat sd = new SimpleDateFormat("d MMM yyyy");
	      String date = sd.format(cal.getTime());
	      System.out.println(date);
		
	}

}
