package extension2;

public class four
{

	public static void main(String[] args)
	{
		System.out.println("before Try");
		try
		{
			System.out.println("file1");
			System.out.println("file2");
			System.out.println(10/0);
			System.out.println("file3");
			System.out.println("file4");
			
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
		System.out.println("After Try");
		
	}

}
