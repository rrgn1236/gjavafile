package Scanner6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class studentcontroller
	{
		public void save(student std)
			{
				String path ="./Krishna.txt";
				FileWriter fw = null;
				BufferedWriter bw = null;
			
			try
			{
				fw = new FileWriter(path,true);
				bw = new BufferedWriter(fw);
				String s=std.getsid()+","+std.getsname()+","+std.getsage()+","+std.getsmarks()+","+std.getsqual();
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	public void getbyId(int sid)
		{
		
		    String path ="./Krishna.txt";
		    FileReader fr = null;
		     BufferedReader br = null;
		    
		    try
		    {
		    	fr = new FileReader(path);
		    	br = new BufferedReader(fr);
		    	
		    	for(String s=br.readLine(); s!=null; s= br.readLine())
		    	{
		    		String[] data=s.split(",");
		    		if(sid==Integer.valueOf(data[0]))
		    		{
		    			student std = new student();
		    			std.Setsid(Integer.valueOf(data[0]));
		    			std.Setsname(data[1]);
		    			std.Setsage(Integer.valueOf(data[2]));
		    			std.Setsmarks(Double.valueOf(data[3]));
		    			std.Setsqual(data[4]);
		    			
		    			System.out.println(std.getsid());
		    			System.out.println(std.getsname());
		    			System.out.println(std.getsage());
		    			System.out.println(std.getsmarks());
		    			System.out.println(std.getsqual());
		    			
		    		}
		    	}
		    }
		    catch(Exception e)
		    {
		    	
		    }
			
		}
	
	public void getbyname(String sname)
	{
		String path ="./Krishna.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
		      fr = new FileReader(path);
		      br = new BufferedReader(fr);
		      
		      for(String s=br.readLine(); s!=null; s = br.readLine())
		      {
		    	  String[] data =s.split(",");
		    	  if(data.length==5 && sname.equals(data[1]))
		    	  {
		    		 student std = new student();
		    		 std.Setsid(Integer.valueOf(data[0]));
		    		 std.Setsname(data[1]);
		    		 std.Setsage(Integer.valueOf(data[2]));
		    		 std.Setsmarks(Double.valueOf(data[3]));
		    		 std.Setsqual(data[4]);
		    		 
		    		 System.out.println(std.getsid());
		    		 System.out.println(std.getsname());
		    		 System.out.println(std.getsage());
		    		 System.out.println(std.getsmarks());
		    		 System.out.println(std.getsqual());
		    	  }
		    	  
		      }
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public void getall()
	{
		String path ="./Krishna.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			for(String s =br.readLine(); s!=null; s=br.readLine())
			{
				String[] data=s.split(",");
				if(data.length==5) 
				{
				student std= new student();
				std.Setsid(Integer.valueOf(data[0]));
				std.Setsname(data[1]);
				std.Setsage(Integer.valueOf(data[2]));
				std.Setsmarks(Double.valueOf(data[3]));
				std.Setsqual(data[4]);
				
				System.out.println(std.getsid());
				System.out.println(std.getsname());
				System.out.println(std.getsage());
				System.out.println(std.getsmarks());
				System.out.println(std.getsqual());
				
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
