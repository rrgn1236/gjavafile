package Scanner3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class studentcontroller
{
	public void save(student std)
		{
			String path="./Radha.txt";
			FileWriter fa = null;
			BufferedWriter ba = null; 
			
			try
				{
					fa = new FileWriter(path,true);
					ba = new BufferedWriter(fa);
					String ab =std.getsid()+","+std.getsname()+","+std.getsage()+","+std.getmarks()+","+std.getsqual();
					  ba.write(ab);
					  ba.newLine();
					  ba.flush();
				
			  }
			catch(Exception e)
				{
					System.out.println(e);
				}
			
		}
	public void getbyId(int sid)
		{
		    	String path="./Radha.txt";
				FileReader fr =null;
				BufferedReader br = null;
			try
				{
					fr = new FileReader(path);
					br = new BufferedReader(fr);
					student st = null;
				
					for(String s =br.readLine(); s!=null; s=br.readLine())
							{
								String[] data = s.split(",");
								if(data.length >0 && Integer.parseInt(data[0])==sid)
									{
										st = new student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4]);
										System.out.println(st.getsid());
										System.out.println(st.getsname());
										System.out.println(st.getsage());
										System.out.println(st.getmarks());
										System.out.println(st.getsqual());
										System.out.println("id clicked details dispalyed succesfully completed");
									}
							
							}
				}
			catch(Exception e)
				{
					System.out.println(e);
				}
		}	
	public void getbyname(String sname)
		{
				String path ="./Radha.txt";
				FileReader fr = null;
				BufferedReader br = null;
				 
				try
				{
					fr = new FileReader(path);
					br = new BufferedReader(fr);
					student st = null;
					boolean found = false;
					for(String sa =br.readLine(); sa!=br.readLine(); sa=br.readLine())
					{
						String[] data =sa.split(",");
						if(data.length > 0 && data[1].equals(sname))
						{
							st = new student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),data[4]);
							System.out.println(st.getsid());
							System.out.println(st.getsname());
							System.out.println(st.getsage());
							System.out.println(st.getmarks());
							System.out.println(st.getsqual());
							found = true;
							System.out.println("The name related data is printed succesfulyy");
						}
				
					}
					if(!found)
						{
							System.out.println("invaid name");
						}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
 
	public void getall()
		{
		      String path ="./Radha.txt";
		      FileReader fr = null;
		      BufferedReader br = null;
		      try
		      	{
		    	  fr = new FileReader(path);
		    	  br = new BufferedReader(fr);
		    	  student st = null;
		    	  	for(String s =br.readLine(); s!=br.readLine(); s=br.readLine())
		    	  		{
		    	  			String[] data =s.split(",");
		    	  			if(data.length > 0)
		    	  				{
		    	  					st = new student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),data[4]);
		    	  					System.out.println(st.getsid());
		    	  					System.out.println(st.getsname());
		    	  					System.out.println(st.getsage());
		    	  					System.out.println(st.getmarks());
		    	  					System.out.println(st.getsqual());
		    	  				}
		    	  			else
		    	  				{
		    	  					System.out.println("invalid details");
		    	  				}
		    	  				}
		    	  
		    	  
		      		}
		      		catch(Exception e)
		      		{
		      			System.out.println(e);
		      		}
				
		}
}
