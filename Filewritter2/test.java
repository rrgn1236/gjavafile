package Filewritter2;

public class test
{

	 public static void main(String[] args)
		{
		 Studentpojo std = new Studentpojo();
		 std.Setsid(3);
		 std.Setsname("Radha");
		 std.Setsage(21);
		 std.Setsmarks(90.90);
		 std.Setsqual("Degree");
		 
		 
		 stdcontroller st = new stdcontroller();
		 st.writest(std);
		
	
		 
			
			
	
		}

}
