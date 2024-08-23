package com.interface3;

public abstract class A1
{
	int a =10;
	public static String b ="bhanu";
	protected int d = 18;
	
	static
	{
		System.out.println("abstract class static block");
	}
	
	{
		System.out.println("abstract class instance block");
	}
	public static void main(String[] args)
	{
		System.out.println(b);
	}
	

}
