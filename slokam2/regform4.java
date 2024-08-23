package slokam2;

public class regform4
{

	public static void main(String[] args)
	{
		regform3 r =new regform3();
		r.setid(5);
		r.setname("          RAHUL");
		r.setmarks(90);
		r.setloc("HYD");
		r.setage(67);
		
		System.out.println(r);
		System.out.println("id is="+r.getid());
		System.out.println("My name is ="+r.getsname());
		System.out.println("My marks is ="+r.getmarks());
		System.out.println("My location is ="+r.getloc());
		System.out.println("My age is="+r.getage());
		
		

	}

}
