package hashset;

import java.util.Objects;

public class employee
	{
	
	//it is overrided in object class String to String classs //
			@Override
			//String to String class //
				public String toString()
				{
					return "Employee[eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
				}
	
			
			@Override
			//Hashcode method in object class //
			//This hashcode value is generate based on content //
			//Two objects may have same hashcode buit the contents may be different //
			public int hashCode()
			{
				// integer hashcode , String Hashcode //
				// it taking the eid value and it take the ename value
				//and it taking the esalary value and it is calling object classs hashcode//
				/* eid is calling internally Integer.hashcode(eid),String.hashcode(ename),
				 * double.hashcode(esal). it is all to gether is getting summedum */
				System.out.println("hashcode -----"+Objects.hash(eid,ename,esal));
				return Objects.hash(eid, ename, esal);
			}
			
			//Equals method //
			//When ever Hashcodes are same i will calls equal method //
			//it allows or not allows it will check equals method //
			
			@Override
			public boolean equals(Object obj)
			{
				System.out.println("hascode same I will calls equal method ");
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

			private int eid;
			private String ename;
			private double esal;
	//Constrector call //
			public employee(int eid,String ename,double esal)
			{
				super();
				this.eid = eid;
				this.ename = ename;
				this.esal  = esal;
			}
           // getus and setus method //
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
				this.esal = esal;
			}
	}
