package com.protected3;

import com.Protected2.y2;

public class y3 extends y2
	{
	protected y3()
		{
			System.out.println("y3 default constrector");
		}
	protected y3(int a)
		{
		a =10;
			System.out.println(a);
		}
	
	

	public static void main(String[] args)
		{
			y3 a = new y3();
			y3 b = new y3(12);
		   
	
		}

	}
