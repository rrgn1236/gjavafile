package com.interface2;

public class sbi implements cebil
{

	
	public double rai(double amount)
	{
		double rate1 = 6;
		if(rate1>= cebil)
		{
			double rate2 = amount * rate1 / 100;
			System.out.println("This is sbi rate of interest="+rate2);
		}
		else
		{
			System.out.println("This is cebil of rai in sbi");
		}
		return 0.0;
	}

	
	public double croploan(double amount)
	{
		double crop1 = 7.9;
		if(crop1>=cropcebil)
		{
			double crop2 = amount * crop1 / 100;
			System.out.println("crop loan of sbi="+crop2);
		}
		else
		{
			System.out.println("Not eligible for cebil in sbi");

		}
		return 0.0;
	}

	
	public double shoploan(double amount)
	{
		double shop1 = 9.1;
		if(shop1>=shopcebil)
		{
			double shop2 = amount * shop1 / 100 ;
			System.out.println("This is shop loan for sbi="+shop2);

		}
		else
		{
			System.out.println("not eligible for cebil in shop of sbi");

		}
		return 0.0;
	}

}
