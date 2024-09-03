package ScannerClass1;

import java.util.Scanner;

public class testscan
	{
	     public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("please enter the sid=");
		//Console is asked the sid we give the value in console //
			int sid=sc.nextInt();
			
			System.out.println("please enter the sname=");
	  //The sname is asked in console we give data into console //
			String sname=sc.next();
			
			System.out.println("Please enter sage=");
		//The console is asked in the given data the data we give in console//
			int sage=sc.nextInt();
			
			System.out.println("please Enter smarks=");
	//The console is asked in the given data the data we give in console//
			double smarks=sc.nextDouble();
			
			System.out.println("please Enter squalification=");
	//The console is asked in the given data the data we give in console//
			String squal=sc.next();
			
			// The data will print which is given values in the console //
				System.out.println("Scanner received the value:-"+sid);
				System.out.println("Scanner received the name:-"+sname);
				System.out.println("Scanner received the sage:-"+sage);
				System.out.println("Scanner received the smarks:-"+smarks);
				System.out.println("Scanner Received the SQual:-"+squal);
			
		}
	}
