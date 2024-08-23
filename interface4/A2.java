package com.interface4;

public class A2 extends Aq
{
	
	
	public int m1(double amount)
	{
	
		System.out.println(amount);
		return 0;
	}


	public static void main(String[] args)
	{
		A2  ar = new A2();
		System.out.println(ar.a);
		System.out.println(ar.b);
		System.out.println(ar.d);
		ar.m1(4000);
		ar.m1(50000);
	}

	}
