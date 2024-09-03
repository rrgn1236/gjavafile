package extension2;

public class Seven 
{
	public static void m1()
	{
		System.out.println("m1 method start");
		m2();
		System.out.println("m1 method ended");

	}
	public static void m2()
	{
		System.out.println("m2 method start");
		m3();
       System.out.println("m2 method end");

	}
	public static void m3()
	{
		System.out.println("m3 method start");
		m4();
		System.out.println("m3 method ended");

	}
	public static void m4()
	{
		System.out.println("m4 method start");
		System.out.println(10/5);
		try
		{
		System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("m4 method ended");

	}

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("main method start");
		try
		{
		m1();
		}
		catch(ArithmeticException b)
		{
			System.out.println(b);
		}
		System.out.println("main method ended");

	

	}

}
