package Extension3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A1 
{
	public static void main(String[] args)
	{
		String a ="C:\\julyjavabatch\\Abstract\\abclass1.txt";
		
		try
		{
			FileReader Reader = new FileReader(a);
			BufferedReader Read = new BufferedReader(Reader);
		     
			  for(String j=Read.readLine(); j!=null; j=Read.readLine())
			  {
				 System.out.println(j); 
			  }
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Filenotfound"+e);
		}
		catch(IOException p)
		{
		  System.out.println("File of io exception "+p);	
		}
	
	}
}