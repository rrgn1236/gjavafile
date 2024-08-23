package slokam2;

public class regform
{
    private int sid;
    private String sname;
    private double smarks;
    private String sloc;
    private int age;
    
    public int getid()
    {
    	return sid;
    }
    public void setid(int id)
    {
    	this.sid =id;
    }
    public String getname()
    {
    	return sname;
    }
    
    public void setsname(String sname)
    {
    	this.sname=sname.trim();
    }
    public double getmarks()
    {
    	return smarks;
    }
    
    
    public void setsmarks(double smarks)
    {
    	this.smarks=smarks;
    }
    public String getloc()
    {
    	return sloc;
    }
    
    
    public void setsloc(String sloc)
    {
    	this.sloc=sloc;
    }
    public int getage()
    {
    	return age;
    	
    }
    public void setage(int age)
    {
    	if(age>=18 && age<=50)
    	{
    		this.age=age;
    	}
    	else
    	{
    		this.age=0;
    	}
    }
   
   }


