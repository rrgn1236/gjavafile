package extension2;

public class a14 
{

	public static void main(String[] args) 
	{
	System.out.println("started block");	
	  try
	  {
		  System.out.println("1 st try");
		  
		  try
		  {
			  System.out.println("Nested try");
			  System.out.println(10/0);
		  }
		  catch(NullPointerException e)
		  {
			  System.out.println("Nested catch"+e);
		  }
		  System.out.println("hello");
	  }
	  catch(Exception e)
	  {
        System.out.println("1 st catch"+e);
	  }
	  System.out.println("end");

}
}