package com.cisco.Hashmap;

import java.util.HashMap;

public class test2
{

	public static void main(String[] args)
	{
	/*Map always consider key and Values
	 * The data is coming on hashcode it means the data is not print in preserved
	 * order.
	 * insertion order is not maintained
	 * duplicate data is not allowed two datas are same it will come on update(or)latest key.
	 * The values can be duplicate the keys can"t be duplicate.
	 * Values can be null in any number of times.
	 * null data
	 * key
	 * value
	 * Hashing technic is applied on only on keys not an values.
	 *  */
		HashMap<String,Integer> h = new HashMap();
		
		h.put(null,123);
		h.put(null, null);
		h.put("Raja", 103);
		h.put("Narayan", 105);
		h.put("Sachi", 105);
		h.put("umesh", 106);
		h.put("umesh", 107);
		
		System.out.println(h);

	}

}
