package com.assignment.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;

public class CalculateAVG {

	public static void main(String[] args) throws Exception {
		
		String line="";
		String sum="";
		int count=0;
		//Array<> arr=new Array<>();
		BufferedReader br= new BufferedReader(new FileReader("C:\\\\Users\\\\pushpa kashyap\\\\Desktop\\\\sample.csv"));
		

		while((line=br.readLine())!=null)
		{
			String[] values=line.split(",");
			int x=Integer.parseInt(values[4]);
			System.out.println(x);
//			sum=sum+values[4];
//			count++;
			
			
		}
		
//		System.out.println("sum");
	}

}
