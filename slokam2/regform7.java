package slokam2;

public class regform7
{
	static String model="TATA";
	private int cid;
	private String cname;
	private String ccolor;
	private double cprice;
	
	
	public int getcid()
	{
	return cid;	
	}
	public void stdcid(int id)
	{
		this.cid=id;
		
	}
	public String getname()
	{
		return cname;
	}
	public void stdname(String ccname)
	{
		this.cname=ccname.trim();
	}
	
	public String getccolor()
	{
		return ccolor;
	}
	
	public void strclolor(String cccolor)
	{
		this.ccolor=cccolor;
	}
	
	public double grtpric()
	{
		return cprice;
	}
    public void strprice(double price)
    {
    	this.cprice=price;
    }
}
