package extension1;
import java.io.File;
public class A7 {

	public static void main(String[] args) {
		String name ="C:\\Users";
		File f = new File(name);
		File[] data =f.listFiles();
		for(int i =0;i<data.length-1;i++)
		{
			
			if(data[i].isDirectory());
			{
				System.out.println(data[i]+"-----"+data[i].isDirectory()+"---"+data[i].isFile());
				File[] data2 =f.listFiles();
				for(int j = 0; j<data2.length-1;j++)
				{
					System.out.println(data2[j]);
				}
			}
		}
	}

}
