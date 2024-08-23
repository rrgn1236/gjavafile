package com.interface2;

public interface laptop
{
   public void audio();
   
   public void video();
   
   public void music();
   
   public void screen();
   
   default void memory()
   {
	   memory1();
	   m2();
	   System.out.println("Default memory");
   }
   static void memory1()
   {
	   m2();
	   System.out.println("Static memory");
   }
   private void m1()
   {
	   m2();
	   System.out.println("This is private one");
	   
   }
   private static void m2()
   {
	   System.out.println("This is private static");
   }
   
   public static void main(String[] args)
   {
	   m2();
	   memory1();
	   
	   
	   
   }
		   
   }
   

