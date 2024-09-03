package extension1;
import java.io.File;
public class A4 
{

	public static void main(String[] args)
	{
		String path ="C:\\julyjavabatch";
		File f = new File(path);
		File[] data=f.listFiles();
		for(int i =0;i<data.length-1;i++)
		{
			System.out.println(data[i]+"------"+data[i].isDirectory()+"-----"+data[i].isFile()+"-----"+data[i].length());
		}
		
		
	}

}
