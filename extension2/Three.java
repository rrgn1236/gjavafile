package extension2;

public class Three 
{

	public static void main(String[] args)
	{
		System.out.println("befor the try block"); 
		try
		{
			System.out.println("file1");
			System.out.println("file2");
			System.out.println(10/0);
			System.out.println("file3");
			
		}
 // it will stop 13,14 lines and it will print catch block and After catch block//
		//catch(ArithmeticException e)
//This null point is stop 13,14 and it will come outside of program any data is not display//
		//catch(NullPointerException e)
//Exception is child is arthematic exception parent is exception then it will stop printling 3,4 lines nd it will print the catch block and after try block
		catch(Exception e)
		{
			System.out.println("catch--e"+e);
			
		}
		System.out.println("After Tryblock");
		

	}

}
