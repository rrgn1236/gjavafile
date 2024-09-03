package extension2;

import java.io.FileReader;

public class Raju 
 {

	public static void main(String[] args)
	{
		
		try
		{
			//path name is correct it will come from tryblock//
			String path = "C:\\julyjavabatch\\Abstract\\abclass11.txt";
			FileReader fr =new FileReader(path);
			System.out.println(fr);
			
		}catch(Exception e)
		{
			//path name is wrong it will come from catch block //
			System.out.println("catch block--"+e);
		}
		
	}

}
