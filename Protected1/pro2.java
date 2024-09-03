package com.Protected1;

public class pro2 implements pro1
{
	public pro2()
	{
		System.out.println("default constrector");
	}
	{
		System.out.println("instance block");
	}

	@Override
	public void m2()
	{
		System.out.println("hiii");
		
	}

	@Override
	public void m4()
	{
		System.out.println("hello");
		
	}

	public static void main(String[] args)
	{
		pro2 p = new pro2();
		p.m8();
		p.m2();
		p.m4();

	}

	
}
