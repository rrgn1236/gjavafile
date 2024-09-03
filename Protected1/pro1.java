package com.Protected1;

public interface pro1
{
	
	public static int a =10;
	public static final int b = 20;
	int c = 30;
	public void m2();
	void m4();
	
	//it can acces only public static and default for implementing
	public static void m1() 
	{
		System.out.println(a);
	}
	default  void m8()
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		m1();
		
		
	}
}
