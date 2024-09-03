package Scanner3;

import java.util.Scanner;

public class test
	{
	        public static void main(String[] args)
			{
				studentcontroller std = new studentcontroller();
				
				Scanner sc = new Scanner(System.in);
				System.out.println("The save option click press---1");
				System.out.println("To get the data based on id press-----2");
				System.out.println("To get the data baseed on name press--3");
				System.out.println("To get the all persions data press---4");
				
				int choiceoperation = sc.nextInt();
				
				switch(choiceoperation)
				{
				case 1:
					System.out.println("please enter student id:-");
					int sid =sc.nextInt();
					
					System.out.println("please enter Student name :-");
					String sname =sc.next();
					
					System.out.println("please enter Student age :-");
					int sage =sc.nextInt();
					
					System.out.println("please enter student marks:-");
					double smarks =sc.nextDouble();
					
					System.out.println("please Enter Student qualification :-");
					String squal=sc.next();
					
					std.save(new student(sid, sname, sage, smarks, squal));
					System.out.println("Data saved succefully");
					
				 break;
				 
				case 2: System.out.println("Please enter the sid=====");
				        std.getbyId(sc.nextInt());
				  break;
				  
				case 3: System.out.println("please enter the sname=====");
				        std.getbyname(sc.next());
				   break;
				   
				case 4: System.out.println("get all operation started");
				        std.getall();
				  
				      break;
				      default:
				    	  System.out.println("Invalid key");
				}
				
				
				
			}
	}
