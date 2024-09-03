package Sacnner4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class studentcontoller
{
	
	public void save(student std)
	{
		String path ="./Radha.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try
		 {
			 fw = new FileWriter(path,true);
			 bw = new BufferedWriter(fw);
			 String sd =std.getid()+","+std.getsname()+","+std.getsage()+","+std.getsmarks()+","+std.getsqual();
			  bw.write(sd);
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
		
		String path ="./Radha.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			for(String s = br.readLine(); s!=null; s=br.readLine())
			{
				String[] data =s.split(s);
			  if(sid==Integer.valueOf(data[0]))
			  {
				student std = new student();
				std.Setsid(Integer.valueOf(data[0]));
				std.Setsname(data[1]);
				std.Setsage(Integer.valueOf(data[2]));
				std.Setsmarks(Double.valueOf(data[3]));
				std.Setsqual(data[4]);
				
				System.out.println(std.getid());
				System.out.println(std.getsname());
				System.out.println(std.getsage());
				System.out.println(std.getsmarks());
				System.out.println(std.getsqual());
				
				System.out.println("-----------------------");
			  }
				
			}
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	public void getbyName(String sname)
	{
		System.out.println("name of data"+sname);
		
	}
	
	public void getall()
	{
		System.out.println("get all data ");
	}
	

}
