package slokam2;

public class looping
{

	public static void main(String[] args)
	{
		
		
	    for( int i=1; i<=10; i=i+1)
	    {
	    	if(i<=5)
	    	{
	    		for( int j=1; j<=i; j++)
	    		
	    			System.out.print("*");
	    		}
	    	else
	    	{
	    	 for(int j=i; j<10; j++)
	    		 System.out.print("*");
	    	}
	    	System.out.println(" ");
	    }

	}

}
