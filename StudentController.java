package fileReader1;

import java.io.BufferedReader;
import java.io.FileReader;

public class StudentController
{
	
		public void getdata()
		{
			//propertie of String //
			String path ="./Radha.txt";
  //it is created a class reference object not created directly object//
			FileReader fr = null;
			BufferedReader Br = null;
			
			
			try
			{
 //created a object in class reference object constrector path is must and should be //
				fr = new FileReader(path);
				Br= new BufferedReader(fr);
				
				//for loop//
	        	//initalization           condition     update/increment //
				for(String s = Br.readLine();  s!=null;    s=Br.readLine())
				{
					
					//Spliting data data based on (,) this camma //
					String[] data =s.split(",");
					
					//Taken a student object //
					Student std = new Student();
					//initalizing string size  in student properties
				   //	by using setus methods
					std.Setid(Integer.valueOf(data[0]));
					std.Setsname(data[1]);
					std.Setsage(Integer.valueOf(data[2]));
					std.Setsmarks(Double.valueOf(data[3]));
					std.Setsqual(data[4]);
					
					//printing student values by using getus method
					System.out.println(std.getsid());
					System.out.println(std.getsname());
					System.out.println(std.getsage());
					System.out.println(std.getmarks());
					System.out.println(std.getsqual());
					System.out.println("--------------");
					
				}
				
			} 
			
			catch (Exception e)
			{
				System.out.println(e);
			}
		}


}
