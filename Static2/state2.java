package Static2;

public class state2
{

	int x=25;
    static int y =20;
	
	
	
	static
	{
		
		System.out.println("This is first static method=="+y);
		
		
		state2 n1 = new state2();
		System.out.println("it is in static");
       		
		
	}
	
	{
		
		System.out.println("This is first instance method=="+x);
		System.out.println("This is Second instance method=="+y);
		
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("main-----------");
		
		state2 n = new state2();
		
		
	

	}

}
