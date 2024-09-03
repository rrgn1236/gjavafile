package com.Protected1;

public class Tom2 extends Tom1
{
	     @Override
		public void m1()
		{
			System.out.println("m1 method Tom2");
		}
	     
	     @Override
	     public void m2()
	     {
	    	  System.out.println("m2 Tom2");
	     }
	     
	     @Override
	     public void m3()
	     {
	    	 System.out.println("m3 Tom2");
	     }

	     @Override
	     public void m4()
	     {
	    	 System.out.println("m4 Tom2");
	     }
	    	 
	     
	
	     public static void main(String[] args)
	     {
		      Tom1 a = new Tom2();
		      a.m1();
		      a.m2();
		      a.m3();
		      a.m4();

	     }
}
