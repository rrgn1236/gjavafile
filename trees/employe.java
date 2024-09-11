package trees;

import java.util.Objects;

public class employe implements Comparable<employe>

{
	
	//It is based on eid in it will come the data in ascending order only //
	@Override
	public int compareTo(employe e)
	{
//		/*in  if any class implements comparable it can implement 
//		 * only one property */
//		
//		//return this.eid.compareTo(e.getsid());
//		//return this.ename.compareTo(e.getename());
 	return this.esal.compareTo(e.getesal());
 	}
	
	
	private Integer eid;
	private String ename;
	private Double esal;
	
	public String toString()
	{
		return "eid ="+eid+", ename ="+ename+",esal ="+esal;
	}

	public employe(Integer eid,String ename,Double esal)
	{
		super();
		this.eid =eid;
		this.ename =ename;
		this.esal = esal;
	}
	
	public Integer getsid()
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
	
	public Double getesal()
	{
		return esal;
	}
	public void Setesal(Double esal)
	{
		this.esal =esal;
	}

	
}
