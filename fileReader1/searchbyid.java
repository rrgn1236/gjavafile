package fileReader1;

import java.io.BufferedReader;
import java.io.FileReader;

public class searchbyid
	{
	
	 public void search(int sid)
	 {
		String path = "./radha.txt";
		FileReader fa = null;
		BufferedReader Br = null;
		
			try
			{
				fa =new FileReader(path);
				Br = new BufferedReader(fa);
				
				for(String sa = Br.readLine(); sa!=null; sa=Br.readLine())
				{
					String[] data = sa.split(",");
					if(sid==Integer.valueOf(data[0]))
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
						
				     }
				 }
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	  }

  }