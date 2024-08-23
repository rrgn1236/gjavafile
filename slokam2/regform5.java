package slokam2;

public class regform5
{

	static String bank="hdfc bank";
	private int haccno;
	private String hname;
	private double hbal;
	private String hifsc;
	
	
	
	public int getacno()
	{
		return haccno;
	}
	public void stdacno(int std)
	{
		this.haccno=std;
	}
 
	public String getname()
	{
		return hname;
	}
	public void hname(String name)
	{
		this.hname=name;
	}
	
     public double getbal()
     {
    	 return hbal;
     }
	public void stdbal(double bal1)
	{
		this.hbal=bal1;
	}
	
	public String getifsc()
	{
		return hifsc;
	}
	
	public void stdifsc(String ifs)
	{
		this.hifsc=ifs;
	}
}
