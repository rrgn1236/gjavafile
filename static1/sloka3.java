package static1;

public class sloka3
{

	public static void main(String[] args)
	{

		System.out.println("First static is ="+sloka2.a);
		sloka2.a=sloka2.a*2;
		System.out.println("Second static is="+sloka2.a);
		sloka2.a=sloka2.a*3;
		System.out.println("Third static is="+sloka2.a);
		System.out.println("---------------------------------");
		
		System.out.println("First name is static is="+sloka2.sname);
		sloka2.sname="ROSHAN";
		System.out.println("Second name of static is="+sloka2.sname);
		sloka2.sname="AJAY JOSH";
		System.out.println("Third name of static is="+sloka2.sname);
		sloka2.sname="RAMAKRISHNA";
		System.out.println("Fourth name of static is="+sloka2.sname);
		System.out.println("--------------------------------------------");
		
		sloka2 r = new sloka2();
		System.out.println("First value of object is="+r.x);
		r.x=r.x*3;
		System.out.println("Second value of object is="+r.x);
		System.out.println("----------------------------------");
		System.out.println("First object of y is="+r.y);
		r.y=r.y*4;
		System.out.println("Second object of y is="+r.y);
		
		
		
	}

}
