package extension1;

public class Raju1 
{
	public void s1()
	{
		System.out.println("s1--"+Thread.currentThread().getName());
		System.out.println("s1 started");
		s2();
		System.out.println("s1 is ended");
	}
	
	public void s2()
	{
		System.out.println("s2"+Thread.currentThread().getName());
		System.out.println("s2 is started");
		s3();
		System.out.println("s2 is ended");
	}
	public void s3()
	{
		System.out.println(Thread.currentThread().getId());
	    System.out.println("s3 is started");
	    System.out.println("s3 is ended");
	}

	
	public static void main(String[] args) 
	{
	
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("start main method");
		Raju1 R = new Raju1();
		R.s1();
		System.out.println("end method");
	}

}
