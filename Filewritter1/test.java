package Filewritter1;

public class test
{

	public static void main(String[] args)
	{
	
		studentpojo std1 = new studentpojo();
		std1.Setsid(1);
		std1.Setsname("Rajagopal");
		std1.Setsage(22);
		std1.Setsmarks(56.67);
		std1.Setsqual("Mca");
		  
		stdcontroller st = new stdcontroller();
		st.writingdata(std1);
		
		
	}

}
