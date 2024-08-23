package com.interface2;

public class hdfc implements cebil
{

	
	public double rai(double amount)
	{
		int rai1 = 10;
		if(rai1>=cebil)
		{
			double interest1 = amount * rai1 / 100;
			System.out.println("Rate of interest of hdfc="+interest1);
		}
		else
		{
			System.out.println("cebil score is not eligible");
		}
			
		return 0.0;
	}

	
	public double croploan(double amount)
	{
		int croploan = 15;
		if(croploan>=cropcebil)
		{
			double crop1 = amount * croploan / 100;
			System.out.println("This is crop loan of hdfc="+crop1);
		}
		else
		{
			System.out.println("You are not eligible for cebil score hdfc");
		}
		
		return 0.0;
	}

	
	public double shoploan(double amount)
	{
		int shopint = 20;
		if(shopint>=shopcebil)
		{
			double shop1 = amount * shopint / 100;
			System.out.println("This is hdfc shoprateofinterest="+shop1);
		}
		else
		{
			System.out.println("This is hdfc shop loan is not eligible");
		}
		
		return 0.0;
	}

}
