package extension1;

import java.io.File;

public class A1
{
	public static void main(String[] args) 
	{
		
	String path ="C:\\julyjavabatch\\Rajagopal\\student.txt";
	
	  File f = new File(path);
	  System.out.println(f.exists());
	  System.out.println(f.canExecute());
	  System.out.println(f.canRead());
	  System.out.println(f.canWrite());
	  System.out.println(f.getFreeSpace());
	  System.out.println(f.getAbsolutePath());
	  System.out.println(f.getName());
	  System.out.println(f.getParent());
	  System.out.println(f.getTotalSpace());
	  System.out.println(f.isFile());
	
	
	}

}
