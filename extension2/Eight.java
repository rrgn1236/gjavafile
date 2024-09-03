package extension2;

public class Eight
{

	public static void m1()
	{
		System.out.println("m1 method start");
		m2();
		System.out.println("m1 method is ended");
	}
	public static void m2()
	{
	   System.out.println("m2 method start");
		m3();
		System.out.println("m2 method is endeed");
	}
	public static void m3() 
	{
		System.out.println("m3 method start");
		try
		{
		m4();
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
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
		catch(NullPointerException c)
		{
			System.out.println(c);
		}
		System.out.println("m4 method endeed");
	}
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("main method start");
		m1();
		System.out.println("mainmethod end");
	
		
	}

}
