package com.slokam;

public class cal1
{
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println("Before call="+c);
		return c;	
	}
	
	int minus(int a,int b)
	{
		int c=a-b;
		System.out.println("Before minus="+c);
		return c;
	}
	
	double module(double a, double b)
	{
		double c =a / b;
		System.out.println("Before module="+c);
		return c;
		
	}
	
	double multiplay(double a ,double b)
	{
		double c =a*b;
		System.out.println("Before multiplay="+c);
		return c;
	}
	public static void main(String[] args)
	{
		cal1 k = new cal1();
		int value=k.add(3, 4);
		System.out.println("After call="+k);
		System.out.println("After adding="+value);
		int value1 =k.minus(5, 6);
		System.out.println("After call="+k);
		System.out.println("After minus="+value1);
		double value2 =k.multiplay(5,6);
		System.out.println("After call="+k);
		System.out.println("Afer Multiplay="+value2);
		
		
		
		
		
	}
}
