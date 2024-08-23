package com.slokam;

public class calc
{
  
	void add(int a ,int b)
	{
		int c = a+b;
		System.out.println("Addition="+c);
	}

	void minus( int a,int b)
	{
		int c = a-b;
		System.out.println("Minus="+c);
		
	}
	
	void multi(int a, int b)
	{
		int c= a*b;
		System.out.println("Multiplay="+c);
	}
	public static void main(String[] args)
	{
		calc r = new calc();
		r.add(3,4);
		r.minus(40, 36);
		r.multi(4, 3);
	}
	
}
