package com.Protected1;

public class y1
{
	protected y1()
	{
		System.out.println("y1 default constrector");
	}
	protected y1(int i)
	{
		i =20;
		System.out.println("The value is="+i);
	}
	protected y1(String j)
	{
		j ="radha";
		System.out.println("The name is="+j);
	}
	

	public static void main(String[] args)
	{
		y1 a = new y1();
		y1 b = new y1(12);
		y1 c = new y1("String");
		

	}

}
