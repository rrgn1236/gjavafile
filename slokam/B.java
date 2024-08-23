package slokam;

public class B extends A
{	
	@Override
	public bike Drive()
	{
		System.out.println("parent class drive");
		bike b = new bike();
		return b;
	}
	@Override
	public car chain()
	{
		System.out.println("parent in chain");
	    car c = new car();
	    return c;
	}
	
}
