package Filewritter1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fa1
{
	
	public static void main(String[] args)
	{
		String path="./Raju.txt";
		
		
		
		
		try(    FileWriter fr = new FileWriter(path, true);
				BufferedWriter br = new BufferedWriter(fr);    )
		{
			String n = "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv";
			br.write(n);
			br.flush();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
		
		
		
		
		
		
//		FileWriter fr = null;
//		BufferedWriter br = null;
//		try 
//		{
//			fr = new FileWriter(path, true);
//			br = new BufferedWriter(fr);
//			String n = "------------------uuuuuu";
//			br.write(n);
//			br.flush();
//			System.out.println(1/0);
//			
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally 
//		{	
//			try {
//			br.close();
//			fr.close();
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
