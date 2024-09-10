package hashset;

import java.util.HashSet;

public class test4
{

	public static void main(String[] args)
	{
		Integer i = new Integer(11);
		String s = new String("Radhaa");
		
		//Hash code is allowing duplicate data //
		/*The hashcode is how it is generating is  1 is
		   generating a hashcode using the integer classs.
		   Ramu is generating a hashcode based on String 
		   double salary is generating a based on hashcode
		   all these is summed up  */
		   
		employee e1 = new employee(1,"Ramu",78.89);
		employee e2 = new employee(2,"Radha",38.89);
		employee e3 = new employee(3,"Aa",48.89);
		//This is not unique data //
		//i want to check 3 and 4 then it will be a final conversation //
		//equal method is used for final conformation //
		employee e4 = new employee(3,"BB",48.89);
		//These two contents are different but the hashcode is same//
		//Employe id and name Should not be the same //
		
		/*Two objects may have same hashcode buit the contents may be different or same 
		two objects are equal in content comparision then definately
		they will have same hashcode */
		
		
		/* 
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());*/
		
			HashSet n = new HashSet();
			//When ever we call add method it will go to employee class hashcode //
			n.add(e1);
			n.add(e2);
			n.add(e3);
			n.add(e4);
			System.out.println(n);

	}

}
