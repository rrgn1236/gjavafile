package extension1;
import java.io.File;
public class A2 
{

	public static void main(String[] args)
	{
	
		String spath ="C:\\julyjavabatch\\Rajagopal\\student.txt";
		
	   File f = new File(spath);
	   System.out.println(f.getPath());
	   System.out.println(f.exists());
	   System.out.println(f.canRead());
	   System.out.println(f.canWrite());
	   System.out.println(f.getAbsolutePath());
	   System.out.println(f.getFreeSpace());
	   System.out.println(f.getName());
	   System.out.println(f.getParent());
	   System.out.println(f.isDirectory());
	   System.out.println(f.getTotalSpace());
	}

}
