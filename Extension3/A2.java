package Extension3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A2
{

	public static void main(String[] args)
	{
		//String path ="C:\\julyjavabatch\\Abstract\\abclass1.txt";
		String path = "./Raja.txt";
		
		try
		{
			FileReader Rad = new FileReader(path);
			  
			int j =Rad.read();
			   while( j!=-1)
			   {
				   
				   System.out.print( (char)j );
				   j =Rad.read();
			   }
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
			
		}
		catch(IOException d)
		{
			System.out.println(d);
		}

	}

}
