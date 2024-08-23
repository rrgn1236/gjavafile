package com.slokam;

public class calc2
{

	int add(int x, int y)
	{
		int z= x+y;
		System.out.println("Before call="+z);
		return z;
	}
	int minus(int x,int y)
	{
		int z= x-y;
		System.out.println("Before call="+z);
		return z;
		
	}
	 double multi(double x, double y)
	 {
		 double z = x*y;
		 System.out.println("Before call"+z);
		 return z;
	 }

	
	 public static void main(String[] args)
	{
		calc2 k = new calc2();
		int value =k.add(4, 5);
		System.out.println("After address1="+k);
		System.out.println("After adding="+value);
		int value1=k.minus(4, 2);
		System.out.println("After address2="+k);
		System.out.println("After minus="+value1);
		double value2 =k.multi(5,4);
		System.out.println("After address2="+k);
		System.out.println("After multi="+value2);
	}

}
