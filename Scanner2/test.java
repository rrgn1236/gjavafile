package Scanner2;

import java.util.Scanner;


public class test
	{
	
	public static void main(String[] args)
	{
		Studentcontroller std = new Studentcontroller();
	
			Scanner s = new Scanner(System.in);
	     
		     System.out.println("Which operation whold you like to perform");
		     System.out.println("To save the person data please press ---1");
		     System.out.println("To get the data based on id please press ----2");
		     System.out.println("To get the data based on name please press ---3");
		     System.out.println("to get All person data please press ---4");
		     
			     int choiceofOperation = s.nextInt();
			     
			     switch( choiceofOperation)
	     
			     {
	     
			     	case 1:System.out.println("please enter the sid====");
			     	int sid = s.nextInt();
			     	System.out.println("please enter sid name==");
			     	String sname = s.next();
			     	System.out.println("please enter sage==");
			     	int sage =s.nextInt();
			     	System.out.println("please enter smarks==");
			     	double smarks = s.nextDouble();
			     	System.out.println("please enter squal==");
			     	String squal =s.next();
			   
			    	 break;
			    	 
			     	case 2:
			     	break;
			     	
			     	case 3:
			     	break;
			     	  
			     	case 4:
			     	break;
	     
			     }
		}
	
	}
