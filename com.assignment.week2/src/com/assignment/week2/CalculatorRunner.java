package com.assignment.week2;

import java.util.Scanner;

public class CalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER 1 for adding a date");
		System.out.println("ENTER 2 for substracting a date");
		System.out.println("ENTER 3 for finding day of a week");
		System.out.println("ENTER 4 for finding week of the year");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1: 
			AddNDay a= new AddNDay();
			a.addTime();
		case 2: 
			SubNDay s= new SubNDay();
			s.subTime();
			
		case 3: 
			FindDay fd= new FindDay();
			fd.FindDayOfWeek();
		case 4: 
			FindWeek fw= new FindWeek();
			fw.FindWeekOfYear();
			
		}
		

	}

}
