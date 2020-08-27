package com.assignment.week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVfile {

	public static void main(String[] args) throws Exception {
		

		Scanner sc=new Scanner(new File("C:\\Users\\pushpa kashyap\\Desktop\\sample.csv"));
		sc.useDelimiter(",");
		while(sc.hasNext())
		{
			System.out.print(sc.next()+" ");
			
		}
		sc.close();
	}

}
