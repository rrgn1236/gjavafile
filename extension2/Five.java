package extension2;

import javax.crypto.NullCipher;

public class Five 
{
	public static void m1()
	{
		System.out.println("m1 method is started");
		m2();
		System.out.println("m1 method is ended");
	}
	public static void m2()
	{
		System.out.println("m2 method is started");
		m3();
		System.out.println("m2 method is ended");

	}
	public static void m3()
	{
		System.out.println("m3 method is started");
		try {
		System.out.println(10/0);
		}
		//it is handeled the arithematic exceptions and next line will execute//
		catch(ArithmeticException a)
		//catch(NullPointerException a)
		{
			System.out.println(a);
		}
		System.out.println("m3 method is ended");

	}

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("main method is started");
		m1();
		System.out.println("main method is ended");


		

	}

}
