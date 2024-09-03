package extension2;

public class A16
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("tryy");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("catch1----");
			System.out.println(e);
			try
			{
				System.out.println("try inside the catch"+(10/0));
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			System.out.println("another");
		}

	}

}
