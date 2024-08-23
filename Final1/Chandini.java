package Final1;

public class Chandini extends IsmartShankar
{
	public int a =10;
	// the access controller is final the value is can't change  //
	final int b =10;
	
	 // This will cause a compile-time error
//	//public final void m1()
//	{
//		System.out.println("This is child class m1");
//	}
    
	public static void main(String[] args)
	{
		Chandini c= new Chandini();
				System.out.println(c.a);
		System.out.println(c.b);
		//c.b=30;
		c.m1();
		c.m2();
		c.m3();
		
	}
	

}
