package com.cisco.Hashmap;

import java.util.Objects;

public class employe
	{
			
		public Integer eid;
		public String ename;
		public Double esal;
		
		public employe(Integer eid,String ename, Double esal)
		{
			super();
			this.eid = eid;
			this.ename = ename ;
			this.esal = esal;
		}
		
		
		@Override
		public String toString()
		{
			return "eid=" + eid + ", ename=" + ename + ", esal=" + esal ;
		}

		
		

		@Override
		public int hashCode()
		{
			return Objects.hash(eid, ename, esal);
		}


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
			return Objects.equals(eid, other.eid) && Objects.equals(ename, other.ename)
					&& Objects.equals(esal, other.esal);
		}


		public Integer geteid()
		{
			return eid;
		}
		public void Seteid(Integer eid)
		{
			this.eid =eid;
		}
		
		public String getename()
		{
			return ename;
		}
		public void Setename(String ename)
		{
			this.ename =ename;
		}
		
		public Double getesal()
		{
			return esal;
		}
		public void Setesal(Double esal)
		{
			this.esal = esal;
		}
		
	}
