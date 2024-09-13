package com.cisco.Arraylist;

import java.util.ArrayList;

public class one
{
  public static void main(String[] args)
{
	  int a[] = {1,2,3};
//	
//	  System.out.println(a);
//	  System.out.println(a.length);
//	  System.out.println(a.clone());
	  
	  /* ArrayList
	   * Methods:-
	    
	   *  h.add():- */
	  ArrayList h = new ArrayList();
	  h.add(null);
	  h.add(10);
	  h.add("ghan");
	  h.add(20);
	  h.add(25);
	  h.add(null);
	  h.add(23.35);
	  h.add(false);
	  h.add(true);
	  h.add(a);
	  
	  System.out.println(h);
	  System.out.println(h.size());
	  System.out.println(h.isEmpty());
	  System.out.println(h.indexOf(10));
	  System.out.println(h.contains("ghan"));
	  System.out.println(h.get(1));
	  System.out.println(h.equals(67));
	  System.out.println(h.lastIndexOf(a));
	 // System.out.println("before remove"+h);
	 // System.out.println(h.remove(5));
	 // System.out.println("After remove"+h);
	  System.out.println("before remove"+h);
	  System.out.println(h.set(3, "Slokam"));
	   h.add(5, "Ahaa");
	  System.out.println("After remove"+h);
}
}
