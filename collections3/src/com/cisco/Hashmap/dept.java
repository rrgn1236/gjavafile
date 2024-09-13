package com.cisco.Hashmap;

public class dept
{

	private Integer did;
	private String dname;
	private String dloc;
	
		public dept(Integer did, String dname,String dloc)
		{
			this.did = did;
			this.dname = dname;
			this.dloc = dloc;
		}
	
		@Override
		public String toString()
		{
			return "did=" + did + ", dname=" + dname + ", dloc=" + dloc ;
		}
	
		public Integer getdid()
		{
			return did;
		}
		public void Setdid(Integer did)
		{
			this.did = did;
		}
	
		public String getdname()
		{
			return dname;
		}
		public void Setdname(String dname)
		{
			this.dname = dname;
		}
	
		public String getdloc()
		{
			return dloc;
		}
		public void Setdloc(String dloc)
		{
			this.dloc = dloc;
		}
	
	
	

}
