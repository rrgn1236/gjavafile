package static1;

public class sloka2
{
       static String sname="RAJASHAB";
       static int a=10;
       static int b=20;
          int x=10;
          int y=20;
          String iname="ABBAS";
	public static void main(String[] args)
	{
		
		
		System.out.println("first name in="+sname);
		sname="anuhya";
		System.out.println("Second name is="+sname);
		sname="anitha";
		System.out.println("Third name is="+sname);
		sname="Abhiram";
		System.out.println("Fourth name is="+sname);
		sname="Bharat";
		System.out.println("Fifth name is="+sname);
		
		System.out.println("-------------------------");
		
		System.out.println("First a is="+a);
		a=a+2;
		System.out.println("Second is a a is adding="+a);
		a=a*2;
		System.out.println("Third is multiplaying="+a);
		a=a-2;
		System.out.println("Fourth is minus="+a);
		a=a/2;
		System.out.println("Fifth is devision="+a);
		a=a*5;
		System.out.println("Sixth is multiplaying="+a);
		
		
		System.out.println("-----------------------------");
		sloka2 r = new sloka2();
	      System.out.println("six name is ="+sname);
	      sname="cherry";
	      System.out.println("seventh name is="+sname);
	      
	      System.out.println("-----------------------------");
	      System.out.println("first object is="+r.iname);
	      r.iname="Ranjith";
	      System.out.println("Second object is="+r.iname);
	      r.iname="Yohan";
	      System.out.println("Third object is="+r.iname);
	      
	      System.out.println("----------------------------");
	      
	      System.out.println("First object of x is="+r.x);
	      r.x=r.x+2;
	      System.out.println("Second object of x is="+r.x);
	      r.x=r.x*2;
	      System.out.println("Third object of x is="+r.x);
	      r.x=r.x-4;
	      System.out.println("Fourth object of x is="+r.x);
	      
	      
	      System.out.println("------------------------------");
	      
	      System.out.println("First object of b is="+r.y);
	      r.y=r.y+10;
	      System.out.println("Second object of b is ="+r.y);
	      
	
	}

}
