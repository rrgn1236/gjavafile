package com.cisco.LinkedHashMap;

import java.util.LinkedHashMap;

public class test1
{

	public static void main(String[] args)
	{
		//LinkedHashMap the data will come in given format//
		//Not allowing duplicate data //
		LinkedHashMap<employe,dept> w = new LinkedHashMap();
		
		w.put(new employe(1,"Ramu",78.89),new dept(101,"sales","HYD"));
		w.put(new employe(2,"Lakshman",89.89), new dept(102,"executive","Chennai"));
		w.put(new employe(3,"Sachin",99.08), new dept(103,"Acounting","Benglure"));
		w.put(new employe(3,"Sachin",99.08), new dept(103,"Acounting","Benglure"));
		
		System.out.println(w);
		System.out.println(w.containsKey("Ramu"));
		
		
		
	}
}
