package fileReader1;

public class check
{

		public static void main(String[] args)
		{
			String s ="1,Siva,24,67.78,mca";
			
			String[] data = s.split(",");
			
			int sid=Integer.valueOf(data[0]);
			String sname=data[1];
			int sage =Integer.valueOf(data[2]);
			double smarks =Double.valueOf(data[3]);
			String squal = data[4];
			
			
			Student std = new Student();
			std.Setid(0);
			std.Setsname(s);
			std.Setsage(0);
			std.Setsmarks(0);
			std.Setsqual(s);
			
			
			
			
			
			
			
			
			
			
			
			//When you split the system understand 1 is one string siva is one string like that //
//			System.out.println(data[0]);
//			String sid = data[0];
//			System.out.println(data[1]);
//			String sname = data[1];
//			System.out.println(data[2]);
//			String smarks = data[2];
		}

}
