package else1;

public class nested {

	public static void main(String[] args) {
	          boolean a =true;
	          boolean b =true;
	          boolean c =false;
	          if(a)
	          {
	        	  System.out.println("First if");
	        	  if(b)
	        	  {
	        		  System.out.println("Nested if");
	        		  if(c)
	        		  {
	        			  System.out.println("Nested iff");
	        		  }else
	        		  {
	        			  System.out.println("Nested else 2");
	        		  }
	        	  }else
	        	  {
	        		  System.out.println("Nested else");
	        	  }
	          }else
	          {
	        	  System.out.println("First else");
	          }
	          
	}

}
