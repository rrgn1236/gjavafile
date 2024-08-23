package Static2;

public class static5
{
	 static int s1;
	static  String sname;
	 static long scont;
     static double sfee;
	

	
	  public static void m1()
	  {
		  s1=566;
		  System.out.println("1 st Student id="+s1);
		  s1=2;
		  System.out.println("2 nd student id="+s1);
		  sname="NAVEEn";
		  System.out.println("1 st Student name="+sname);
		  sname="MAHESH";
		  System.out.println("2 nd Student name="+sname);
		  scont=56666666666l;
		  System.out.println("1 st contact number is="+scont);
		  scont=78888888888888l;
		  System.out.println("2 nd contact number is="+scont);
		  sfee=67000.00;
		  System.out.println("1 st term fee is="+sfee);
		  sfee=890000.00;
		  System.out.println("2 nd term fee is="+sfee);
		  
	  }
	  
	  

	  
	  public static void main(String[] args)
	{
		static5 n = new static5();
		n.m1();
	}
}
