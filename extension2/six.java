package extension2;

public class six 
{
	public static void m1()
	{
		System.out.println("m1 method is started");
		try
		{
		m2();
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
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
		catch(NullPointerException a)
		{
			System.out.println(a);

		}
		System.out.println("m3 method is ended");

	}

	public static void main(String[] args)
	{
		System.out.println("mainmethod is started");
		m1();
		System.out.println("main method is endeded");



	}

}
