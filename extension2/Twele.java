package extension2;

public class Twele 
{
	public static void main(String[] args) {
		
		String[] s = {"Arjun",null,"Adithya",null};
		System.out.println("Before try block");
		try
		{
			System.out.println("File1");
			System.out.println("File2");
			System.out.println(s[0]);
			//System.out.println(s[1].length());
			System.out.println(s[2]);
			System.out.println(s[3]);
			System.out.println(10/5);
			System.out.println(10/0);
			
		}
		catch(IndexOutOfBoundsException a)
		{
			System.out.println("The array"+a);
		}
		catch(NullPointerException b)
		{
			System.out.println("Thenullpointer"+b);
		}
		catch(ArithmeticException c)
		{
			System.out.println("The arithematic"+c);
		}
		catch(Exception d)
		{
			System.out.println("This accept all exceptions"+d);
		}
		System.out.println("After truy block");
		
	}
	
	
	
	
	
	
	
	
}

