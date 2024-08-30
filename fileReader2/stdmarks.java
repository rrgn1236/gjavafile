package fileReader2;

import java.io.BufferedReader;
import java.io.FileReader;

public class stdmarks
{
	
	public void smarks()
		{
		      String path ="./Radha.txt";
		      FileReader fr = null;
		      BufferedReader br = null;
		      
		      try
			      {
			    	  fr = new FileReader(path);
			    	  br = new BufferedReader(fr);
			    	  for(String s =br.readLine(); s!=null; s=br.readLine())
				    	  {
				    		  String[] data=s.split(",");
				    		  if(Double.valueOf(data[3])>80.0)
				    		  {
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
				    		  }
				    	  }
			    	  
			      }
		      catch(Exception e)
			      {
			    	  System.out.println(e);
			      }
			
		}
	

}
