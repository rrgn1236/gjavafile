package Scanner1;

import java.util.Scanner;

public class test
	{
	  public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student id:-");
		
		int sid = s.nextInt();
		
		System.out.println("Enter Student name:-");
		
		String sname =s.next();
		
		System.out.println("Enter student age:-");
		
		int sage = s.nextInt();
		
		System.out.println("Enter Student marks:-");
		
		double smarks = s.nextDouble();
		
		System.out.println("Enter Student qualification:-");
		
		String squalify = s.next();
		
		System.out.println("The student id is:-"+sid);
		
		System.out.println("The student name is:-"+sname);
		
		System.out.println("The student age is:-"+sage);
		
		System.out.println("The student marks is:-"+smarks);
		
		System.out.println("The student qualification is :-"+squalify);
		
		
		
	}

	}
