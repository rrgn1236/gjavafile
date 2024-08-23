package com.interface2;

public class indian implements cebil
{

	
	public double rai(double amount)
	{
		double rai1 = 5.5;
		if(rai1>=cebil)
		{
			double rai2 = amount * rai1 / 100;
			System.out.println("rate of interest of indian="+rai2);
		}
		else
		{
			System.out.println("not eligible for cebil");
		}
		return 0.0;
	}

	
	public double croploan(double amount)
	{
		double crop1 = 5.1;
		if(crop1>=cropcebil)
		{
			double crop2 = amount * crop1 / 100 ;
			System.out.println("this is crop loan of indian bank="+crop2);
		}
		else
		{
			System.out.println("This is a cebil not eligible");

		}
		return 0.0;
	}

	
	public double shoploan(double amount)
	{
		double shop1 = 6.3;
		if(shop1>=shopcebil)
		{
			double shop2 = amount * shop1 / 100 ;
			System.out.println("This is shop loan of indian="+shop2);
        }
		else
		{
			System.out.println("This is not eligible for cebil ");

		}
		
		return 0.0;
	}

}
