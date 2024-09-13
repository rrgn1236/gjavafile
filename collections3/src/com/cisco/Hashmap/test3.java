package com.cisco.Hashmap;

import java.util.HashMap;

public class test3
{

	public static void main(String[] args)
	{
		//MAin importent is only key it will generate hashcode based on key
		 HashMap <employe,Integer> h = new HashMap();
		 
		 h.put(new employe(101,"siva",45.60),101);
		 h.put(new employe(102,"Raju",46.60),102);
		 h.put(new employe(103,"Adhi",47.60),103);
		 //hashing technic is applied in key
		 h.put(new employe(104,"srinu",48.60),104);
		 //why it is allowing duplicate data in object are created 
		 //in hashcode it will go to employe class there hashcode is not there
		 //then it will go to object class hashcode method there objects
		 //will be stored in heapmemory tahts the reason it allows duplicate data//
		 h.put(new employe(104,"srinu",48.60),104);
		 
		 
		 System.out.println(h);
		 
		 
				 
	}

}
