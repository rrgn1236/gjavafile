package com.interface4;

public class gopal implements bank
{

	
	public void onlinetransation(double amount)
	{
	System.out.println("online transation");	
		
	}

	
	public int onlineOrder(String[] order, String location)
	{
		System.out.println("online order loc to hyd");	
		
		return 1234;
	}
	public static void main(String[] args)
	{
		gopal g = new gopal();
		
	}



}
