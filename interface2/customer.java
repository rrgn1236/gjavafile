package com.interface2;

public class customer
{

	public static void main(String[] args)
	{
		axis a = new axis();
		a.croploan(45000);
		a.rai(60000);
		a.shoploan(90000);
		System.out.println("-------------");
		
		hdfc a1 = new hdfc ();
		
		a1.croploan(60000);
		a1.rai(70000);
		a1.shoploan(100000);
		System.out.println("-------------");
		
		indian a2 = new indian();
		a2.croploan(67000);
		a2.rai(77000);
		a2.shoploan(87000);
		System.out.println("-------------");
		
		kotakmahendra a3 = new kotakmahendra();
		a3.croploan(70000);
		a3.rai(80000);
		a3.shoploan(90000);
		System.out.println("-------------");
		
		sbi a4 = new sbi();
		a4.croploan(45610.2);
		a4.rai(54312.6);
		a4.shoploan(99980.9);
		System.out.println("-------------");
		
	}
}
