package fileReader2;

import java.io.BufferedReader;
import java.io.FileReader;

public class StudentController
	{
	
	public void stddata()
	{
		String path ="./Radha.txt";
		FileReader fa = null;
		BufferedReader ba = null;
		
			try
			{
				fa = new FileReader(path);
				ba = new BufferedReader(fa);
				
				for(String s =ba.readLine(); s!=null;  s=ba.readLine())
					{
					    String[] data =s.split(",");
					    student std = new student();
					    std.Setid(Integer.valueOf(data[0]));
					    std.Setsname(data[1]);
					    std.Setsage(Integer.valueOf(data[2]));
					    std.Setsmarks(Double.valueOf(data[3]));
					    std.Setsqual(data[4]);
					    
					    System.out.println(std.getsid());
					    System.out.println(std.getsname());
					    System.out.println(std.getsage());
					    System.out.println(std.getmarks());
					    System.out.println(std.getsqual());
					    System.out.println("------------");
						
					}
					
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
		}
	
	}
