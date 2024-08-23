package com.interface2;

public class axis implements cebil
{

	
	
	public double rai(double amount)
	{
		int interest =6;
		
		if(interest>=cebil)
		{
			double interest1 = amount * interest/100;
			System.out.println("Rate of interest="+interest1);
		}
		else
		{
			System.out.println("Not eligible for loan cebil score is less");
		}
		return 0.0;
	}

	public double croploan(double amount)
	{
		int croploan =10;
		if(croploan>=cropcebil)
		{
			double crop2 = amount *  croploan / 100;
			System.out.println("This is axis bank crop loan interest="+crop2);
		}
		else
		{
			System.out.println("you are not eligible for croploan axis bank");
		}
		return 0.0;
	}

	
	public double shoploan(double amount)
	{
		int shoprate = 12 ;
		if(shoprate>=shopcebil)
		{
			double shopinterest1 = amount * shoprate /100 ;
			System.out.println("Axis bank this is shoploan="+shopinterest1);
		}
		else
		{
			System.out.println("You are not eligiple for cebil of shop loan");
		}
		
		return 0.0;
	}

}
