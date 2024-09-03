package extension2;

public class leven
{

	public static void main(String[] args) 
	{
		System.out.println("before block");
		String[] arr= {"Raju","Radha","Krishna"};
		try
		{
			System.out.println("file1");
			System.out.println("File2");
			System.out.println("File3");
			System.out.println(10/2);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(10/0);
			System.out.println(arr[2]);
			
		}
		catch(NullPointerException a)
		{
			System.out.println("Nullpoint--"+a);
		}
		catch(IndexOutOfBoundsException b)
		{
			System.out.println("indexboundary--"+b);
		}
	
		catch(ArithmeticException c)
		{
			System.out.println("Arithe--"+c);
		}
		catch(Exception d)
		{
			System.out.println("All exception--"+d);
		}
		System.out.println("After the block");
		

	}

}
