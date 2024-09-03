package Scanner6;

import java.util.Scanner;

public class test
	{
       public static void main(String[] args)
       	{
    // Scanner class it will print the data on console data also take in output //	   
    	   Scanner sc = new Scanner(System.in);
		// This will display the data to give options which we should wan't //
    	   System.out.println("To save the student data please press----1");
    	   System.out.println("To get the data based on id press-----2");
    	   System.out.println("To get the data based on name press ---3");
    	   System.out.println("to get all the data press -----4");
		
    	   //Student class of data //
    	   	student std = new student();
    	   	
    	   	//Studnet controller class all code we write in this class //
    	   	studentcontroller stc = new studentcontroller();
		//it is choice operation of givendata the options should ask in integer only //
    	   	int choiceoperation =sc.nextInt();
		//we use the switch case here //
    	   		switch(choiceoperation)
    	   			{
    	   		case 1:
    	   			//Here data is displayed by using scanner class and give input on this class //
						System.out.println("please enter student id=");
						std.Setsid(sc.nextInt());
						System.out.println("Please enter student name =");
						std.Setsname(sc.next());
						System.out.println("pleas enter student age=");
						std.Setsage(sc.nextInt());
						System.out.println("please enter student marks=");
						std.Setsmarks(sc.nextDouble());
						System.out.println("please enter student qualification");
						std.Setsqual(sc.next());
						
				//Here this is studentcontroller class save method the logic will be in this method //
						stc.save(std);
						System.out.println("Student details saved succesfully");
				break;
			
    	   		case 2:
    	   			//this case is given id the data will be dispalyed here //
    	   					System.out.println("Enter the student id =");
    	   					stc.getbyId(sc.nextInt());
    	   					System.out.println("The student details is opened");
    	   		break;
			
    	   		case 3:
    	   			//This case is given we give name the data will be dispaly //
    	   					System.out.println("Enter the student name=");
    	   					stc.getbyname(sc.next());
    	   		break;
			
    	   		case 4:
    	   			//hwew the data is dispalyed all data of students //
    	   					System.out.println("All the students are dispalyed");
    	   					stc.getall();
    	   		break;
			
    	   		default: 
    	   						System.out.println("invalid data");
    	   			}
	
			
       	}
	}
