package Filewritter2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class stdcontroller
	{
	     public void writest(Studentpojo std)
		     {
	    	      System.out.println("Connecting to file");
	    	 
		    	 String path = "./Radha.txt";
		    	 FileWriter fa = null;
		    	 BufferedWriter ba = null;
		    	 try
			    	 {
		    		 //Filewritter connects path and gives a true means the old data is won't delete //
		    		 
			    		 fa = new FileWriter(path,true);
			    		 ba = new BufferedWriter(fa);
			    		 String sd = std.getsid()+","+std.getsname()+","+std.getsage()+","+std.getsmarks()+","+std.getsqual();
			    		 
			    		System.out.println("Connecting to studentobject to string----");
			    		//buffer is writting the String data of sd//
			    		 ba.write(sd);
			    		 
			    		 //After enter the data it will automatically come to new line //
			    		 ba.newLine();
			    		 
			    		 //move from buffer to file (or) folder //
			    		 ba.flush();
			    		
			    		 
			    	 }
		    	 catch(Exception e)
			    	 {
			    		 System.out.println(e);
			    	 }
		    	 System.out.println("File connecting completed------");
		     }
	}
