package hashset;

import java.util.HashSet;

//every calss object class is a parent//
//What object class will give address of that code//
//Object class hashcode is based on adddress//
public class test2
{

	public static void main(String[] args)
	{
		
		//How it is not allowing the duplicate value by checking the hashcode on the content //
		//All wraper classes what ever you check based on the content //
		
		Integer k = new Integer(12);
		//it is integer class //
		//in integer class hasgcode is based on content //
		k.hashCode();
		String n = new String("Radhaa");
		//it is String class hashcode //
		n.hashCode();
		//Based on content it will genearte the hash code//
		//HashSet is not allowing any duplicate data //
		//HashSet is go to integer folat double String classes //
		HashSet h = new HashSet();
		
		h.add(12);///it calls hash code integer call hash code//
		h.add(k);//integer class hash code//'
		h.add(n);//String class hash code //
		h.add("Radhaa");
		
		System.out.println(h);
		System.out.println(k);
		System.out.println(n);
		
		
	}

}
