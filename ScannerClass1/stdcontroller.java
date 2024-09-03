package ScannerClass1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class stdcontroller
	{
	     public void write(stdmojo std)
		     {
		    	 String path="./Radha.txt";
		    	 FileWriter fa = null;
		    	 BufferedWriter ba = null;
		    	 
		    	 try
			    	 {
			    		fa = new FileWriter(path);
			    		ba=new BufferedWriter(fa);
			    		
			    		String sz=std.getid()+"*"+std.getsname()+"*"+std.getage()+"*"+std.getsmarks()+"*"+std.getsqual();
			    		ba.write(sz);
			    	 }
		    	 catch(Exception e)
			    	 {
			    		 System.out.println(e);
			    	 }
		     }
	}
