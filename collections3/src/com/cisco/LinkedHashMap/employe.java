package com.cisco.LinkedHashMap;

import java.util.Objects;

public class employe
{
	
	private Integer eid;
	private String ename;
	private Double esal;
	
    public employe(Integer eid, String ename,Double esal)
    {
    	this.eid = eid;
    	this.ename = ename;
    	this.esal = esal;
    }
   /* it is used to print the data from test classs */
	@Override
	public String toString()
	{
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}
	
	
	/* it is used to own implementation of hashcode it will
	 * check the content compersion of hashcode if both are same it will go to
	 * equals method*/
	@Override
	public int hashCode()
	{
		return Objects.hash(eid, ename, esal);
	}

	/* if both Hshcodes are same it will come to equals method and check it line by line*/
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employe other = (employe) obj;
		return Objects.equals(eid, other.eid) && Objects.equals(ename, other.ename) && Objects.equals(esal, other.esal);
	}

	public Integer geteid()
	{
		return eid;
	}
	public void Seteid(Integer eid)
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
	public void Setesal(Double esal)
	{
		this.esal = esal;
	}
    

}
