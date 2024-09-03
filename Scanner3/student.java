package Scanner3;

public class student
{
   private int sid;
   private String sname;
   private int sage;
   private double smarks;
   private String squal;
   
   public student(int sid,String sname,int sage,double smarks,String squal)
   {
	   this.sid=sid;
	   this.sname=sname;
	   this.sage=sage;
	   this.smarks=smarks;
	   this.squal =squal;
   }
   
	   public int getsid()
	   		{
		   		return sid;
	   		}
	   public void Setsid(int sid)
	   		{
		   		this.sid =sid;
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
			   this.smarks=smarks;
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
