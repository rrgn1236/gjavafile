package extension1;
import java.io.File;
public class A5 
{

	public static void main(String[] args) 
	{
		//set path //
		String path ="C:\\Users";
		//File class //
		File f = new File(path);
		//list of filles //
		File[] data=f.listFiles();
		//for loop for files //
		for(int i =0;i<data.length-1;i++)
		{
			// condition for directory or folder //
			if(data[i].isDirectory());
			{
				// To print that directoory
				System.out.println(data[i]+"--"+data[i].isDirectory());
				//calling files list using arrray//
				File[] fnames=data[i].listFiles();
				//Files leanth //
				for(int j =0;j<fnames.length-1;j++)
				{
					//print files in j//
					System.out.println(fnames[j]);
				}
				
			}
			
		}
		

	}

}
