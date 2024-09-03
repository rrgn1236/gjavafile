package Scanner5;

import java.util.Scanner;

public class test
{

	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
		
				System.out.println("To save the data press--1");
				System.out.println("To get the data by student id press ---2");
				System.out.println("To get the sata by student name press ---3");
				System.out.println("To get the all data press--4");
		
				student std = new student();
				studentcontroller scr = new studentcontroller();
				int choiceoperation =sc.nextInt();
					switch(choiceoperation)
						{
						case 1:
								System.out.println("Enter student id:-");
								std.Setsid(sc.nextInt());
			
								System.out.println("Enter student name:-");
								std.Setsname(sc.next());
			
								System.out.println("Enter student age:-");
								std.Setsage(sc.nextInt());
			
								System.out.println("Enter Student marks :-");
								std.Setsmarks(sc.nextDouble());
			
								System.out.println("Enter student Qualify:-");
								std.Setsqual(sc.next());
			
								scr.save(std);
								System.out.println("Data Saved Succefullyy");
			
							break;
		
						case 2:
								System.out.println("Enter student id:-");
								scr.getbyId(sc.nextInt());
							break;
			
						case 3:
								System.out.println("Enter student name :-");
								scr.getbyName(sc.next());
							break;
			
						case 4:
								System.out.println("get all student data :-");
								scr.getall();
								System.out.println("data is completed");
						break;
			
				default:
							System.out.println("no data is entered");
		}
	}
}
