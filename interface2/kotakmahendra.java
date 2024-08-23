package com.interface2;

public class kotakmahendra implements cebil
{

	public double rai(double amount)
	{
		int rai1 = 25;
		if(rai1>=cebil)
		{
			double rai2 = amount * rai1 / 100;
			System.out.println("Rate of interest ="+rai2);

		}
		else
		{
			System.out.println("This is not celibe of kotak mahendra");

		}
		return 0.0;
	}


	public double croploan(double amount)
	{
		double crop1 = 15.5;
		if(crop1>=cropcebil)
		{
			double crop2 = amount * crop1 / 100;
			System.out.println("This is kotak crop interest="+crop2);

		}
		else
		{
			System.out.println("Kotak is not eligible of cebil");

		}
		return 0.0;
	}

	
	public double shoploan(double amount)
	{
		double shop1 = 33.1;
		if(shop1>=shopcebil)
		{
			double shop2 = amount * shop1 / 100 ;
			System.out.println("Kotak shop loan is ="+shop2);

		}
		else
		{
			System.out.println("This is cebil of kotak shop loan");

		}
			
		return 0.0;
	}

}
