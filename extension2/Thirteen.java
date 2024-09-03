package extension2;

public class Thirteen {

	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("1 st try");
			System.out.println(10/5);
			
			try
			{
				System.out.println("Nested Try");
				System.out.println(10/0);
	
			}
			catch(Exception e)
			{
				System.out.println("Nested catch"+e);
			}
		}
		catch(Exception e)
		{
			System.out.println("First catch"+e);
		}
		System.out.println("end");

	}

}
