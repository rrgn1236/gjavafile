package extension1;
import java.io.File;
public class A3 
 {

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
	    String path ="C:\\julyjavabatch\\Rajagopal";
	    File a = new File(path);
	    System.out.println(a.canExecute());
	    System.out.println(a.canRead());
	    System.out.println(a.canWrite());
	    System.out.println(a.exists());
	    System.out.println(a.getFreeSpace());
	    

	}

}
