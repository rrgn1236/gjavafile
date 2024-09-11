package hasset1;

import java.util.Objects;

public class student
{

	private int sid;
	private String sname;
	private double smarks;
	
	@Override
	public String toString()
	{
		return "Student[sid = "+sid +", sname ="+ sname + ",smarks ="+smarks+"]";
	}
	
		public int hashcode()
		{
			return Objects.hash(sid,sname,smarks);
		}
		
		
		@Override
	public boolean equals(Object obj)
	{
		System.out.println("hashcode same I will calls equals method ");
		
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		student other = (student) obj;
		return sid == other.sid && Objects.equals(sname,other.sname)
				&& Double.doubleToLongBits(smarks) == Double.doubleToLongBits(other.smarks);
		
	}
	public student(int sid, String sname,double smarks)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	
	public int getsid()
	{
		return sid;
	}
	public void Setsid(int sid)
	{
		this.sid = sid;
	}
	
	public String getsname()
	{
		return sname;
	}
	public void Setsname(String sname)
	{
		this.sname = sname;
	}
	
	public double getsmarks()
	{
		return smarks;
	}
	
	public void Setsmarks()
	{
		this.smarks = smarks;
	}
}
