package slokam2;

public class regform1
{

	public static void main(String[] args)
	{
		regform r = new regform();
	    r.setid(4);
	    r.setsname("   RAJU");
	    r.setsmarks(89);
	    r.setsloc("Miyapur");
	    r.setage(65);
	    
		System.out.println(r.getid());
		System.out.println(r.getname());
        System.out.println(r.getmarks());
        System.out.println(r.getloc());
        System.out.println(r.getage());
	}

}
