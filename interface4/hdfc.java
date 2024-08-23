package com.interface4;

public class hdfc extends Bank
{

	@Override
	public double rai(double amount)
	{
		int cb1= 10;
		if(cb1>=cebil)
		{
			double rai1 = amount * cebil / 100;
			System.out.println("The amount of rate of interest is ="+rai1);
		}
		else
		{
			System.out.println("This is not accept the cebil");
		}

		return 0.0;
	}
	public static void main(String[] args)
	{
		Bank ba = new hdfc();
		boolean value =ba.cebil("jhbivbcbivvvv");
		System.out.println(value);
		ba.rai(567777.77);
	}
	

}
