package extension1;

public class siva {
	
	public void m1()
	{
		System.out.println("m1 method--"+Thread.currentThread().getName());
		System.out.println("m1 method is start");
		m2();
		System.out.println("m1 method is ended");
		
	}
	
	public void m2()
	{
		System.out.println("mathod m2---"+Thread.currentThread().getName());
		System.out.println("m2 method is start");
		m3();
		System.out.println("m2 method is ended");
	}
	
	public void m3()
	{
		System.out.println("m3 Thread--"+Thread.currentThread().getName());
		System.out.println("m3 method is start");
		m4();
		System.out.println("m3 method is ended");
	}
	
	public void m4()
	{
		System.out.println("m4 method-----"+Thread.currentThread().getName());
		System.out.println("m4 method is start");
		m5();
		System.out.println("m4 method is ended");
	}
	public void m5()
	{
		System.out.println("m5 method ---"+Thread.currentThread().getName());
		System.out.println("m5 methos is start");
		System.out.println("m5 method is ended");
	}
	
	//method method is jvm directly won't call it create athread and call
	//the main method with thread the thread name is main  //
	public static void main(String[] args) 
	
	{
		//the thread it will check line by line//
		//This is show the current thread in the class//
		System.out.println("main--"+Thread.currentThread().getName());
		System.out.println("Main method is started");
		//it will create an object//
		siva s = new siva();
		s.m1();
		System.out.println("main method is ended");
		
		
	}

}
