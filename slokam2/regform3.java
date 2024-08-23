package slokam2;

public class regform3
{
     private int sid ;
     private String sname;
     private double smarks;
     private String sloc;
     private int sage;
    
     
     public int getid()
     {
    	 return sid;
     }
     public void setid(int id)
     {
    	 this.sid=id;
     }
     
     
     public String getsname()
     {
    	 return sname;
     }
     public void setname(String name)
     {
    	 this.sname=name.trim();
     }
     
     public double getmarks()
     {
    	 return smarks;
     }
     public void setmarks(double marks)
     {
    	 this.smarks=marks;
    	 
     }
     public String getloc()
     {
    	 return sloc;
     }
     
     public void setloc(String loc)
     {
    	 this.sloc=loc;
     }
      public int getage()
      {
    	  return  sage;
      }
     public void setage(int age)
     {
    	 if(age>20 && age<60)
    	 {
    		 this.sage=age;
    	 }
    	 else
    	 {
    		 this.sage=0;
    	 }
     }
     
}
