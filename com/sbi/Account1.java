package com.sbi;

public class Account1
{
	static  String Bankname = "HDFC bank";
     String name;
     int acc;
     double balanc;
     
     void deposit(double da)
     {
    	 balanc = balanc + da;
     }
     
     void withdraw(double wa)
     {
    	 balanc = balanc - wa;
     }
     
     
     
     void checkbalance()
     {
    	 System.out.println(balanc);
     }
     
     
     
     
     public static void main(String[] args) {
    	 Account1 a1 = new Account1();
    	 a1.name = "RajaGopal";
    	 a1.acc = 12345;
    	 a1.balanc = 40000;
    	 a1.checkbalance();
    	 System.out.println(a1.name);
    	 System.out.println(a1.acc);
    	 System.out.println(a1.balanc);
    	 a1.deposit(5000);
    	 System.out.println(a1.balanc);
    	 a1.withdraw(20000);
    	 System.out.println(a1.balanc);
    	 
    	 
    	 
    	 
    	 
    	 
     }
     
}
