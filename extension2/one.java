package extension2;

public class one {

	//program starts from main method//
	public static void main(String[] args) 
	{
		//here don't have any conditions //
		//it will come to try block directlyy//
		try
		{
			System.out.println("haiii1");
			System.out.println("haiii2");
			System.out.println("haiii3");
			System.out.println(10/5);
			System.out.println(10/5);
			//when ever we got the proglem the next lines are not executed//
			//it will stop the program and directly go to catch block//
			//try followed by catch //
			//System.out.println(10/0);//
			System.out.println("haiii4");
			System.out.println("haiii5");
			
		}
		//Try block any errors it finds the catch blockk//
		//if there is no problem  try only executed //
		catch (Exception e)
		{
			System.out.println("catch---"+e);
		}
		
	}

}
