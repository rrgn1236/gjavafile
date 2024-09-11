package hasset1;

import java.util.HashSet;

public class test2
{

	public static void main(String[] args)
	{
		
		
		student s1 = new student(1,"Ramu",78.80);
		student s2 = new student(2,"Radha",90.90);
		student s3 = new student(3,"Ajaydavan",80.80);
		student s4 = new student(3,"Ajaydavan",80.80);

		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		HashSet h = new HashSet();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		
		System.out.println(h);
		
	}

		

	

}
