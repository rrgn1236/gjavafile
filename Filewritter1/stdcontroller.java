package Filewritter1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class stdcontroller
	{
	   public void writingdata(studentpojo std)
		   {
			   String path ="D:\\student\\text.txt";
			//Writing the charectors in one by one //
			   FileWriter fw = null;
			//writing the entire line 
			   BufferedWriter bw = null;
			   
			   try
				   { 
				   //Object created for fileWritterclass //
				         fw = new FileWriter(path);
				         //Object is created for bufferwritter class/
				         bw = new BufferedWriter(fw);
				         //object is created on studentpojo in this method
				         //we taken that object into this method //
				         String sd = std.getsid()+","+std.getsname()+","+std.getage()+","+std.getsmarks()+","+std.getsqual();
				         //That object data is connected to file Bufferedwriter // 
				         bw.write(sd);
				         
				         
				   }
			   catch(Exception e)
				   {
				   //any eceptions come to e
					   System.out.println(e);
				   }
		   }
	}
