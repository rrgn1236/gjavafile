package Extension3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class A 
{

		
			public static void main(String[] args)
			{
				try
				{
				String path="C:\\julyjavabatch\\Abstract\\abclass1.txt";
				FileReader a = new FileReader(path);
				BufferedReader b = new BufferedReader(a);
				System.out.println(b.readLine());
				System.out.println(b.readLine());
				System.out.println(b.readLine());
				System.out.println(b.readLine());
				
				
				
				}
				catch(FileNotFoundException e)
				{
					
					System.out.println("FilenotFound"+e);
				}
				catch(IOException f)
				{
					System.out.println("IoException"+f);
					
				}
				
				


						}

}
