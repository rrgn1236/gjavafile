package com.interface1;

public interface laptop
{
	public void mouse();
	
	public void keyboard();
	
	public void display();
	
	public void audio();
	
	default void m2()
	{
		m1();
		System.out.println("hello");
	}
	static  void m1()
	{
		m4();
		System.out.println("hiiii");
		
	}
	private  void m5()
	{
		System.out.println("this is private");
		
	}
	private static void m4()
	{
		System.out.println("this is private static ");
		
	}
	public static void main(String[] args)
	{
		laptop.m1();
		laptop.m4();
		
	}

}
