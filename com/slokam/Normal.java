package com.slokam;

public class Normal
{
    String getname()
    {
    	String g="Sunny";
    	
    	return g;
    	
    }

   public static void main(String[] args)
   {
	   Normal s =new Normal();
	   String g =s.getname();
	   System.out.println(s);
	   System.out.println("Name is="+g);
   }
}