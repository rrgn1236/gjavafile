package Filewritter4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class stdcontroller
	{
	    public void Writting(Studentpojo1 std)
		    {
		    	String path ="./Radha.txt";
		    	FileWriter fw = null;
		    	BufferedWriter bw = null;
		    	
		    	try
			    	{
			    		fw = new FileWriter(path,true);
			    		bw = new BufferedWriter(fw);
			    		String sd = std.getsid()+","+std.getname()+","+std.getsage()+","+std.getsmks()+","+std.getsqul();
			    		bw.write(sd);
			    		bw.newLine();
			    		bw.flush();
			    		bw.close();
			    		fw.close();
			    	}
		    	catch(Exception e)
			    	{
			    	    System.out.println(e);	
			    	}
		    }
	}
