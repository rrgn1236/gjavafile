package trees;

import java.util.Scanner;
import java.util.TreeSet;

public class test1
{

	public static void main(String[] args)
	{
		/*TreeSet
		 * duplicate data is not allowed 
		 * null inisertion is not possible 
		 * insertion order is ascending 
		 * it allows same kind of data only it means only integer or only String
		 * it works on binary tree alogrithm */
		
		/* it is not only properties it is based on id
		 * name and salary of comparision */
//		employe e1 = new employe(1,"Siva",67.70);
//		employe e2 = new employe(2,"Ram",67.70);
		
		/*it is comapring on e1 and e2 is both are equal it returns 0 
		 * it e1>e2 means it return 1
		 * it e1<e2 means it returns -1*/
//		System.out.println(e1.compareTo(e2));
		Scanner s = new Scanner(System.in);
		System.out.println("please employe operation 1 for based on id:-");
		System.out.println("please empolye operation 2 for based on name:-");
		System.out.println("please employe operation 3 based on Salary:-");
		
		int svalue = s.nextInt();
		switch(svalue)
		{
		case 1 : System.out.println("data based on id:-");
		
			TreeSet b = new TreeSet(new empIdbased());
		
			b.add(new employe(1,"Siva",67.78));
			b.add(new employe(3,"Raju",97.78));
			b.add(new employe(5,"Setty",37.78));
			b.add(new employe(4,"Adithya",87.78));
			b.add(new employe(2,"Arjun",27.78));
        
			System.out.println(b);
		break;
		
		case 2: System.out.println("data based on name:-");
		

		TreeSet b1 = new TreeSet(new empNamecomp());
	
		b1.add(new employe(1,"Siva",67.78));
		b1.add(new employe(3,"Raju",97.78));
		b1.add(new employe(5,"Setty",37.78));
		b1.add(new employe(4,"Adithya",87.78));
		b1.add(new employe(2,"Arjun",27.78));
    
		System.out.println(b1);
		break;
		
		case 3: System.out.println("data based on salary:-");
		
			TreeSet b2 = new TreeSet(new empBasedSal());
		
			b2.add(new employe(1,"Siva",67.78));
			b2.add(new employe(3,"Raju",97.78));
			b2.add(new employe(5,"Setty",37.78));
			b2.add(new employe(4,"Adithya",87.78));
			b2.add(new employe(2,"Arjun",27.78));
        
			System.out.println(b2);
			break;
		
		default :System.out.println("please select proper one");
		}
		
		
	}

}
