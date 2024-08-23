package com.interface3;

import java.util.Arrays;

public class raju implements bank
{

	
	public void onlinetransaction(double amount)
	{
		
		System.out.println(amount);
	}

	
	public int onlineorder(String[] order, String location)
	{
		System.out.println(Arrays.toString(order));
		System.out.println(location);
		System.out.println("online order location hyd");
		
		
		return 1234;
	}
	public static void main(String[] args)
	{
		raju r = new raju();
		r.onlineorder(new String[] {"biryani","gobi","dum biryani"}, "hyd");
	}

}
