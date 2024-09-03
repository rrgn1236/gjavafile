package com.Protected1;

public class Na1
{
	Na1()
	{
		System.out.println("default constrector");
	}
//	static
//	{
//		System.out.println("Static block");
//	}
	{
		System.out.println("instance block");
	}
	protected Na1(String a)
	{
	
		System.out.println("protected");
		a="adhi";
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		Na1 a1 = new Na1("Raj");
		Na1 b1 = new Na1();
		
	}
	

}
