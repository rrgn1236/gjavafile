package com.cisco.Arraylist;

import java.util.ArrayList;

public class two
{

	/*it can add any kind of data //
	ithe arraylist allows duplicate data //
	it allows null insertion multiple times //
	it can all the data 
	a.add():- This method is add any kind of data
	a.addAll(b):- This method is used to add b data also in a
	a.clear():- The all data is cleared at a time .
	a.add(index,value):- The data is added based on index place. 
	a.contain(value):- The value is exist in a it returns true else it return false.
	a.equal(b):- it will check the a and b data the data is same it will return true not same it will return false.
	a.get(index):- Ihe index based value is will be displayed.
	a.get(class):- it will display the class package name.
	a.HashCode():- it will display the hashcode in abstract class.
	a.indexOf(value):-The value background index will be displayed.
	a.isempty():-it will check it is empty or not empty means it will return true else false.
	a.lastindex(value):- it will display the value of index .
	a.remove(index):- index based value is removed.
	a.remove(Value):- Value based data is removed.
	a.size():- it will be dispalyed bassed on size.
	
	
	
	
	
	
	
	    */
	public static void main(String[] args)
	{
		ArrayList b = new ArrayList();
		b.add(12);
		b.add("Arjun");
		ArrayList a = new ArrayList();
		
		a.add(null);
		a.add(12);
		a.add("Raju");
		a.add(12);
		a.add("Sanjay");
		a.add(14);
		a.add(null);
		a.add(true);
		a.add(false);
		a.addAll(b);
		//a.clear();
		//a.clone();
		
		//a.ensureCapacity(2);
		//a.get(3);
		//a.hashCode();
		//a.indexOf(3);
		//a.iterator();
		//a.lastIndexOf(3);
		System.out.println("before"+a);
////		a.remove(2);
//		a.remove("Sanjay");
		a.size();
		
		
		
		
		
		System.out.println(a.size());
		//System.out.println(a.remove(12));
		//System.out.println(a.lastIndexOf(false));
		//System.out.println(a.iterator());
		//System.out.println(a.isEmpty());
		//System.out.println(a.indexOf(14));
		//System.out.println(a.hashCode());
		//System.out.println(a.getClass());
		//System.out.println(b.get(1));
		//System.out.println(a.equals(b));
		//System.out.println(a.containsAll(b));
		//System.out.println(a.contains(12));
		//System.out.println(a.addAll(b));
//		System.out.println("before the adding:-"+a);
//		a.add(3, 29);
//		System.out.println("After the adding :-"+a);
		
		
	}

}
