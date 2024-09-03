package Sacnner4;

import java.util.Scanner;



public class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("which operation would you like perform:-\n");
	    System.out.println("To save the person data please presss ---------------1\n");
	    System.out.println("To get the data on ID based please press --------------2\n");
	    System.out.println("To get the data based on name please presss------3\n");
	    System.out.println("To get the all data please press---4\n");
	  
		
	    student std = new student();
		studentcontoller st = new studentcontoller();
		
		int choiceoperation = sc.nextInt();
		
		switch(choiceoperation)
		{
		
			case 1:System.out.println("please enter student id==");
					int sid =sc.nextInt();
					
					System.out.println("please enter student name :-");
				     String sname =sc.next();
				     
				    System.out.println("please enter student age:-");
				      int sage = sc.nextInt();
				      
				      System.out.println("please enter student marks:-");
				      double smarks=sc.nextDouble();
				      
				      System.out.println("please enter student qualification:-");
				      String squal =sc.next();
				      
				      st.save(new student(sid,sname,sage,smarks,squal));
				      System.out.println("data saved succefully");
			break;
			
			case 2:
					System.out.println("please enter the sid=");
				     st.getbyId(sc.nextInt());
			break;
			
			case 3:
					System.out.println("please enter the sname=");
					st.getbyName(sc.next());
			break;
			
			case 4 :System.out.println("operation started ");
			
			break;
			
			default :
		}
		
	
	}

}
