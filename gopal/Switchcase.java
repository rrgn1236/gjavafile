
package gopal;
import java.util.Scanner;
import static java.lang.System.out;
public class Switchcase {
	
	public static void main(String[] args) {
		
		 int day ;
		 Scanner SC =new Scanner(System.in);
		 System.out.println("Ener the week day from 0 to 6:");
		 day=SC.nextInt();
		  if(day<0 || day>6){
              System.out.println("Invalid weekday number.");
              System.exit(0);
          }
          
          if (day != 0) {
			if (day == 1)
				System.out.println("Monday");
			else if (day == 2)
				System.out.println("Tuesday");
			else if (day == 3)
				System.out.println("Wednesday");
			else if (day == 4)
				System.out.println("Thursday");
			else if (day == 5)
				System.out.println("Friday");
			else if (day == 6)
				System.out.println("Saturday");
			else
				System.out.println("Invalid");
		} else
			System.out.println("Sunday");
	}
