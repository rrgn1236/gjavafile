package extension2;

public class two {

	public static void main(String[] args) 
	{
		System.out.println("before Try block");
		
		try
		{
			System.out.println("file1");
			System.out.println("file2");
			System.out.println(25/5);
			System.out.println(25/0);
			System.out.println("file3");
			
		}
		catch (ArithmeticException e)
		{
		
			System.out.println("catch--"+e);
		}
		System.out.println("After Try block");
	}

}
