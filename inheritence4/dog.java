package inheritence4;

public class dog extends Animal
	{
	   
	 
	    public dog(String name)
	    {
	    	super(name);
	    }
	    
	    @Override
	    public void beak()
	    {
	    	System.out.println(name +"bw bow bow ");
	    }
	    
	    public static void main(String[] args)
		{
	    	  dog da = new dog("Locky");
	    	  da.beak();
	    	  
	    	  
	    		 
	    	
		}
	  
	}
