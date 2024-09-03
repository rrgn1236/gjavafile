package Extension3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A3
{

	public static void main(String[] args)
	{
		String path = "./Radha.txt";
		try
		{
		FileReader fa = new FileReader(path);
		//initilization//
		int i=fa.read();
		//condition //
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fa.read();
			
		}
		
	}
		catch(FileNotFoundException e)
		{
			System.out.println("filenotfound"+e);
		}
		catch(IOException f)
		{
		   System.out.println("IOException"+f);	
		}

}
}