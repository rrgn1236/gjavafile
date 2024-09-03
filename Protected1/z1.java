package com.Protected1;

public class z1
{

	protected	z1()
		{
			System.out.println("Default constrector");
			
		}
		protected z1(int i)
		{
			i=10;
			System.out.println(i);
		}
		protected z1(String s) 
		{
			s ="Radha";
		System.out.println(s);	
		}
		public static void main(String[] args)
		{
			z1 a = new z1();
			System.out.println("------");
			z1 b = new z1(23);
			System.out.println("-------");
			z1 c = new z1("Rajesh");
			
			
		}

}
