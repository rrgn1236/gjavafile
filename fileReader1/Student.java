package fileReader1;

public class Student
{
		//they taken private properties //
		private int sid;
		private String sname;
		private int sage;
		private double smarks;
		private String squal;
	
	// Taken gets and Sets methods why means we convert private properties to public 
	// to  methods public //
		public int getsid()
		{
			return sid;
		}
		public void Setid(int sid)
		{
			this.sid=sid;
		}
		
		public String getsname()
		{
			return sname;
		}
		public void Setsname(String sname)
		{
			this.sname=sname;
		}
		
		public int getsage()
		{
			return sage;
		}
		public void Setsage(int sage)
		{
			this.sage=sage;
		}
		public double getmarks()
		{
			return smarks;
		}
		public void Setsmarks(double smarks)
		{
			this.smarks =smarks;
		}
		public String getsqual()
		{
			return squal;
		}
		public void Setsqual(String squal)
		{
			this.squal=squal;
		}
}
