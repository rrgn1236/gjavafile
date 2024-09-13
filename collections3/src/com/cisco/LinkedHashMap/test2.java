package com.cisco.LinkedHashMap;

import java.util.LinkedHashMap;

public class test2
{

	public static void main(String[] args)
	{
		/*LinkedHashMap the data will come in given format//
				//Not allowing duplicate data  
				 * methods:-
				 * d.containsKey(key):- it will show the given content is present or not
				 * it is prent it will give true else it will give false.
				 * d.containsValue(value):- The value is there means it will give true else
				 * it will give false.
				 * d.get(Key):- if the key is correct it will give based value if the
				 * key is wrong it will give the null value. 
				 * d.isEmpty():-it will check it is empty folders or not empty means it will 
				 * contains true else Return false.
				 * d.remove(key):- it will remove based on key the value it will remove.
				 * d.keySet():- it will return only keys. 
				 * d.values():-it will return only values. 
				 * d.size():- it will display the size.
				 * d.replace(key,Replace(or) new value):- ithe new value will return .*/
		
				LinkedHashMap<String,Integer> d = new LinkedHashMap();
		
				d.put("Siva", 101);
				d.put("Raju", 102);
				d.put("Sachin", 103);
				d.put("Ravi", 104);
				System.out.println(d);
		
		
			
				System.out.println(d.entrySet());
				//d.replace("Siva", 890);
				//System.out.println(d);
				//System.out.println(d.size());
				//System.out.println(d.values());
				//System.out.println(d.keySet());
				//System.out.println(d.remove("Siva"));
				//System.out.println(d);
				//System.out.println(d.isEmpty());
			//	System.out.println(d.get("Raju"));
				//System.out.println(d.containsValue(103));
				//System.out.println(d.containsKey("Siva"));
		
	}

}
