package com.cisco.Hashmap;

import java.util.HashMap;

public class test4
{

	public static void main(String[] args)
	{
		//key and value object classes will acept 
		//but hashcode is generate only for Key .
		HashMap <employe,dept> s = new HashMap();
		s.put(new employe(101,"Radha",78.89), new dept(10,"Ramu","hyd"));
		s.put(new employe(102,"Mahatma",89.90), new dept (20,"localboy","Chennayi"));
		s.put(new employe(103,"Amar",98.89), new dept(30,"john","Benglure"));
		
		System.out.println(s);
	}

}
