package Scanner5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class studentcontroller
{
	public void save(student std)
		{
		
			String path="./Radha.txt";
			FileWriter fr = null;
			BufferedWriter br = null;
		
			try
				{
					fr = new FileWriter(path,true);
					br = new BufferedWriter(fr);
					String data =std.getsid()+","+std.getsname()+","+std.getsage()+","+std.getsmarks()+","+std.getsqual();
					br.write(data);
					br.newLine();
					br.flush();
					System.out.println(data);
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
					for(String s =br.readLine(); s!=null; s=br.readLine())
						{
							String[] data =s.split(",");
							if(sid ==Integer.valueOf(data[0]))
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
				System.out.println(e);
			}
		
		}
	
	public void getbyName(String sname)
		{
			String path ="./Radha.txt";
			FileReader fr = null;
			BufferedReader br = null;
		
		try
		{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			for(String s = br.readLine(); s!= null; s=br.readLine())
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
			
				for(String s =br.readLine(); s!=null; s=br.readLine())
					{
						String[] data =s.split(",");
						if(data.length==5)
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
							System.out.println("---------------------");
						}
					}
			
				}
		catch(Exception e)
			{
				System.out.println(e);
			}
		
		}

	}
