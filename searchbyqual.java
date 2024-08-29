package fileReader1;

import java.io.BufferedReader;
import java.io.FileReader;

public class searchbyqual
  {
	
	public void qualify(String squal)
	{
		String path ="./radha.txt";
		FileReader fa = null;
		BufferedReader Ba = null;
		
		try
			{
			    fa = new FileReader(path);
			    Ba = new BufferedReader(fa);
			    
			    for(String sa = Ba.readLine(); sa!=null; sa=Ba.readLine())
			    {
			    	String[] data = sa.split(",");
		    	 if(squal.equals(data[4]))
			    	{
			    		Student std = new Student();
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
			    		System.out.println("---------------------");
			    	
			    	}
			    	
			    }
				
			}
		catch (Exception e)
			{
				System.out.println(e);
			}
		}

  }
