package static1;

public class sta1
{

	   static int a =1;
	   static int b =32;
	   static int c =20;
	   static String jname="JUNNU";
     	String rname= "RAJAGOPAL";
     	 int m = 56;
     	
   
     	public static void main(String[] args)
		{
			System.out.println("First value of a="+a);
			a=5;
			System.out.println("Second value of a ="+a);
			a=10;
			System.out.println("Third value of a="+a);
			System.out.println("First value of b="+b);
			b=34;
			System.out.println("Second value of="+b);
			b=36;
			System.out.println("Third value of b ="+b);
			System.out.println("First value of c="+c);
			c=22;
			System.out.println("Second value of c="+c);
			c=c+2;
			System.out.println("Third value of c="+c);
			System.out.println("First name="+jname);
			jname= "Rahul";
			System.out.println("Second name is="+jname);
			jname="RAVI";
			System.out.println("Third name is="+jname);
			
			
			System.out.println("---------------------------");
			
			sta1 n = new sta1();
			
			System.out.println(n.rname);
			n.rname="Rena";
			System.out.println(n.rname);
			n.rname="RAJENA";
			System.out.println(n.rname);
			System.out.println(n.m);
			n.m=n.m+2;
			System.out.println(n.m);
			
			
		}
	
}
 