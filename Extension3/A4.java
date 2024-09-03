package Extension3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A4
{

	public static void main(String[] args)
	{
		String path ="./Radha.txt";
		try
			{
				FileReader fa = new FileReader(path);
				BufferedReader ra = new BufferedReader(fa);
				  String j = ra.readLine();
				  while(j!=null)
				  {
					 System.out.println(j); 
					 j = ra.readLine();
				  }
				  
			}
		catch(FileNotFoundException e)
			{
				System.out.println(e);
			}
		catch(IOException f)
			{
				System.out.println(f);
			}
}

}