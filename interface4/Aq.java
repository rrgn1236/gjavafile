package com.interface4;

public abstract class Aq
{
	
	public int a = 10;
	public static int b = 20;
	private static int c = 30;
	public static final int d = 40;
	
	
	
	public abstract int m1(double amount);
	
	public void m2(double amount)
	{
		
	}
	
	static
	{
		System.out.println("it is static");
	}
	
	{
		System.out.println("instance block");
	}

	public static void main(String[] args)
	{
		System.out.println(b);
		System.out.println(d);
		System.out.println(c);
		
	}
}
