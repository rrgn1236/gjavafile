package Filewritter3;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Stdcontroller
	{
	   public void writting(Studentpojo std)
		   {
			   String path ="./Radha.txt";
			   FileWriter fr = null;
			   BufferedWriter br =null;
			   
			   try
				   {
					   fr = new FileWriter(path,true);
					   br = new BufferedWriter(fr);
						    String sr = std.getsid()+","+std.getsname()+","+std.getsage()+","+std.getsmks()+","+std.getsqual();
						    br.write(sr);
						    br.newLine();
						    br.flush();
				   }
			   catch(Exception e)
				   {
					   System.out.println(e);
				   }
			   }
	}
