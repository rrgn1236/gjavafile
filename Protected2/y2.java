package com.Protected2;

import com.Protected1.y1;

public class y2 extends y1
{
	protected y2()
	{
		System.out.println(" y2  default constrector");
	}
	
	protected y2(int i)
	{
		i =100;
		System.out.println(i);
		
	}
	protected y2(String a)
	{
		a ="Abhiram";
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		y2 a = new y2();
		y2 b = new y2(3);
	}

}
