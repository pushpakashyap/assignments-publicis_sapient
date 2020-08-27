package com.assignment.week2;

import java.util.Calendar;
import java.util.Scanner;

public class AddTwoDates {

	public static void main(String[] args) {
//		Scanner scn= new Scanner(System.in);
//		String str1=scn.nextLine();
//		String str2=scn.nextLine();
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		Calendar ctotal=(Calendar) c1.clone();
//		ctotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
		ctotal.add(Calendar.MONTH, c2.get(Calendar.MONTH));
		ctotal.add(Calendar.DATE, c2.get(Calendar.DATE));
		ctotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
		ctotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
		ctotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
		ctotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));
		System.out.println(ctotal.getTime());
		

	}

}
