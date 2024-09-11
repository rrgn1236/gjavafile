package hasset1;

import java.util.Objects;

public class employee
{
	private int eid;
	private String ename;
	private double esal;
	
	
	//Override the object class and write in employee class
	public String toString()
	{
		return "Employee[eid="+ eid + ", ename = "+ ename+" esal ="+ esal +"]";
	}
	
	
	@Override
	public int hashCode()
	{
		System.out.println("Hashcode --"+Objects.hash(eid,ename,esal));
		return Objects.hash(eid, ename, esal);
	}


	@Override
	public boolean equals(Object obj)
	{
		System.out.println("hashcode is same it will check equals method ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
	}


	public employee(int eid,String ename,double esal)
	{
		super();
		this.eid= eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	public int geteid()
	{
		return eid;
	}
	public void Seteid(int eid)
	{
		this.eid = eid;
	}
	public String getename()
	{
		return ename;
	}
	public void Setename(String ename)
	{
		this.ename = ename;
	}
	
	public double getesal()
	{
		return esal;
	}
	public void Setesal(double esal)
	{
		this.esal=esal;
	}

}
