package hashset;

import java.util.HashSet;

public class test3
{

	public static void main(String[] args)
	{
		Integer b = new Integer(12);
		//it is generating the content based //
		//it has override the object hashcode and come to integer classes //
		//it is calling integer classs //
		
		//it is Override the object hashcode to come it in String class //
		String sd = new String("Ramu");
		//it is Calling String class //
		
		//it is based on object class hashcode //
		employee e1 = new employee(1, "Raju"  , 67.78);
		//This hashcode is not comparing the content //
		//in this hashcode is go to object classs only //
		//every object has unique address  and this object is stored in heap memeory //
		//it object class is not taken based on content //
		
		
		employee e2 = new employee(2, "Radha" ,89.89);
		employee e3 = new employee(3, "Satya" ,65.67);
		
		//This object class hashcode is in number format //
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode());
		
		//This is how the internally hashing mechanisam works //
				HashSet n = new HashSet();
				n.add(e1);
				n.add(e2);
				n.add(e3);
				
				System.out.println(n);
		
	}

}
