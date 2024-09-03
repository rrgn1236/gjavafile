package Filewritter3;

public class test
{

	public static void main(String[] args)
		{
			Studentpojo std = new Studentpojo();
			std.Setsid(2);
			std.Setsname("Satya");
			std.Setsage(45);
			std.Setsmks(90.90);
			std.Setsqual("B.Tech");
			
			Stdcontroller st = new Stdcontroller();
			st.writting(std);
		}

}
