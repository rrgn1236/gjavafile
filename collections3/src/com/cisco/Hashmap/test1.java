package com.cisco.Hashmap;

import java.util.HashMap;

public class test1
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> d = new HashMap();
		
		d.put("Abbu", 101);
		d.put("ahan",102);
		d.put("charan", 103);
		d.put("arjun", 104);
		d.put("Abbu", 105);
		//d.clear();
		//d.clone();
		//d.entrySet();
		//d.equals(d);
		//d.get("ahan");
		//d.hashCode();
		//d.isEmpty();
		//d.keySet();
		//d.remove("ahan");
		//d.remove("ahan", 103);
		//d.replace("ahan", 103);
		//d.replace("Ahan", 102, 150);
		//d.size();
		d.values();
		
		
		
		System.out.println(d.values());
		System.out.println(d.size());
		System.out.println(d.keySet());
		System.out.println(d);
		//System.out.println(d.isEmpty());
		//System.out.println(d.hashCode());
	//	System.out.println(d.get("ahan"));
		//System.out.println(d.equals(d));
		//System.out.println(d.entrySet());
		//System.out.println(d.containsValue(105));
		//System.out.println(d.containsKey("ahan"));

	}

}
