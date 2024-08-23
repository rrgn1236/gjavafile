package Static2;

public class state3
{
	
	static String s1name="RAJU";
	static int s1id=46;
	static long s1cont=345678966l;
	static double s1fee=45666.65;
	
	     String s2name;
	     int s2id;
	     long s2cont;
	     double s2fee;
	     
	     static
	     {
	    		 	
	    	
	    	 System.out.println("---------------------------------");
	    	 
	    	 System.out.println("Static first name="+s1name);
	    	 s1name="RAHUL";
	    	 System.out.println("Static Second name="+s1name);
	    	 System.out.println("Static first id="+s1id);
	    	 s1id=34456;
	    	 System.out.println("Static second id="+s1id);
	    	 System.out.println("static first contact number="+s1cont);
	    	 s1cont=65555555555l;
	    	 System.out.println("Static Second contact number="+s1cont);
	    	 System.out.println("Static first fee="+s1fee);
	    	 s1fee=678899.89;
	    	 System.out.println("Static Second fee="+s1fee);
	    	 
	    	 System.out.println("-----------------------------------");	
	    	 state3 s=new state3();
	    	

	     }
	     
	     {
	    	
	    	 s2name="JOHN";
	    	 System.out.println("instance first name="+s2name);
	    	 s2name="Ismail";
             System.out.println("Instance second name="+s2name);
             s2id=45677777;
             System.out.println("instance first id="+s2id);
             s2id=7666666;
             System.out.println("instance Second id="+s2id);
             s2cont=5667777788l;
             System.out.println("instance first contact is="+s2cont);
             s2cont=90999999999l;
             System.out.println("instance Second contact is="+s2cont);
             s2fee=677899.7;
             System.out.println("Instance first fee is="+s2fee);
             s2fee=9099999.9;
             System.out.println("Instance second fee is="+s2fee);
             
	     }
	     
	     
	
	

	public static void main(String[] args)
	{
		 System.out.println("main data is displaying----------");
	}
	
}
