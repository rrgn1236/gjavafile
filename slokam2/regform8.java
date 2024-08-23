package slokam2;

public class regform8
{

	public static void main(String[] args)
	{
	  regform7 n = new regform7();
	  n.stdcid(1);
	  n.stdname("RAJAGOPAL");
	  n.strclolor("yellow");
	  n.strprice(544444.90);
	  System.out.println(n);
	  System.out.println(n.getcid());
	  System.out.println(n.getname());
	  System.out.println(n.getccolor());
	  System.out.println(n.grtpric());
	  System.out.println(n.model);
	       
	  System.out.println("---------------------------------");
	  
	 regform7 n1=new regform7();
	 n1.stdcid(2);
	 n1.stdname("RAHUL");
	 n1.strclolor("BLACK");
	 n1.stdname("MARUTI");
	 n1.strprice(156777777.70);
	 System.out.println(n1);
	 System.out.println(n1.getcid());
	 System.out.println(n1.getname());
	 System.out.println(n1.grtpric());
	 System.out.println(n1.model);
	   
	 System.out.println("-----------------------------------");

	}

}
