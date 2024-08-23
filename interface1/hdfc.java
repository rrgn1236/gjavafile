package com.interface1;

public class hdfc implements bank
{

	 public int interest = 10;
	
	public double rai(double amount)
	{
		
		if(interest>=cybe)
		{
			double rateofinterest = amount*interest/100;
			System.out.println("Rate of interestis="+rateofinterest);
		}
		else
		{
			System.out.println("You are not eligible for loan");
		}
		
		return 0.0;
	}

	
	public  double rateofinterest(double amount)
	{
		double rateofinterest1 = amount*interest/100;
		System.out.println("rate of interest is ="+rateofinterest1);
		
		return 0.0;
	}
	
	public static void main(String[] args)
	{
		hdfc h = new hdfc();
		h.rateofinterest(500000);
		h.rai(70000);
		
	}

}
