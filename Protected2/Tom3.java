package com.Protected2;

import com.Protected1.Tom1;

public class Tom3 extends Tom1
{
        @Override
		public void m1()
		{
			System.out.println("m1 method  Tom3");
		}
        @Override
		public void m2()
		{
			System.out.println("m2 method Tom3");
		}
        @Override
		public void m3()
		{
			System.out.println("m3 method Tom3");
		}
        
		public void m4()
		{
			System.out.println("m4 method Tom3");
		}
	
	
		
	public static void main(String[] args)
	{
		
		Tom3 a = new Tom3();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		
		
	

	}

}
