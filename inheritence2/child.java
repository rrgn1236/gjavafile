package inheritence2;

public class child extends parent2 implements parent3 
	{
	@Override
	public void property()
	{
		System.out.println("child 50 kgs");
	}
	   public static void main(String[] args)
	   {
		   child c = new child();
		   c.property();
		  
	   }
	     
	}
