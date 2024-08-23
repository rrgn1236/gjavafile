package slokam2;

public class regform6
{

	public static void main(String[] args)
	{
		regform5 r = new regform5();
		  r.stdacno(2);
		  r.hname("Rahul");
		  r.stdbal(4566777);
		  r.stdifsc("RGDYGU@$$I*88434");
		  System.out.println(r);
		  System.out.println(r.getacno());
		  System.out.println(r.getname());
		  System.out.println(r.getbal());
		  System.out.println(r.getifsc());
	}

}
