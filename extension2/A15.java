package extension2;

public class A15
{

	public static void main(String[] args) 
	{
		String[] a = {"Raju","Radha",null,"Vikram"};
		System.out.println("Started");
		try
		{
			System.out.println("First try");
			System.out.println(10/2);
			try
			{
				System.out.println("Nested Try");
				System.out.println(10/5);
			}
			catch(Exception e)
			{
				System.out.println("Nested catch");
			}
			System.out.println("hello");
		}
		catch(Exception e)
		{
			System.out.println("First catch");
		}
		System.out.println("end");

	}

}
