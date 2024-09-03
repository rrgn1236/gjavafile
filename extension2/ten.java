package extension2;

public class ten 
{
	public static void main(String[] args) {
		System.out.println("Before Start");
		String[] k = {"raju","ram"};
		try
		{
			System.out.println("file1");
			System.out.println("file2");
			System.out.println(10/5);
			System.out.println(10/2);
			System.out.println(k[0]);
			System.out.println(k[1]);
			System.out.println(k[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic--"+e);
		}
		catch(ArrayIndexOutOfBoundsException R)
		{
			System.out.println("indexboundary"+R);
		}
		System.out.println("After end");
	}

}
