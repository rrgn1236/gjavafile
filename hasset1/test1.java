package hasset1;

import java.util.HashSet;

public class test1
{
      public static void main(String[] args)
	{
    	  //HashSet is not allows the duplicate data //
		Integer a = new Integer(12);
		String S = new String("Radhaa");
		
		employee e1 = new employee(1,"Ramu",78.80);
		employee e2 = new employee(2,"Radha",90.90);
		employee e3 = new employee(3,"Ajaydavan",80.80);
		employee e4 = new employee(3,"Ajaydavan",80.80);
		
		/*
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());*/
		
		HashSet h = new HashSet();
		
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		
		System.out.println(h);
	}
}
