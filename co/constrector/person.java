package co.constrector;

public class person
{
	private int id;
	private String name;
	private int age;
	private adar adr;
	
	
	public person()
	{
		
	}
	public person(int id,String name,int age,adar adr)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.adr=adr;
	}
	
	public adar getadr()
	{
		return adr;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;	
	}

}
