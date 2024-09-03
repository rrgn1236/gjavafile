package com.Protected2;

import com.Protected1.A1;

public class A2 extends A1
{
	protected void getid()
	{
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		
		A2 a = new A2();
		System.out.println(a.d);
		a.getid();
		
		

	}

}
