package com.sbi;

public class Account
{	
	static String BankName = "State Bank of india";
	
	String name;
	int AccNo;
	double blnc;
	
	public void deposit(double da)
	{
		blnc = blnc + da;
	}
	
	public void withdraw(double wa)
	{
		blnc = blnc - wa;
	}
	
	public void checkBalance()
	{
		System.out.println(blnc);
	}
	
	public void showAccNo()
	{
		System.out.println(AccNo);
	}
	
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.name="Raja";
		a1.AccNo=1;
		a1.blnc=10000;
//		System.out.println(a1.blnc);
//		a1.deposit(3000);
//		System.out.println(a1.blnc);
//		
//		a1.withdraw(5000);
//		
//		System.out.println(a1.blnc);
		
	//	a1.checkBalance();
		
		a1.showAccNo();
		
		
	}
	
	
	
}
