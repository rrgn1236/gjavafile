package slokam;

public class A
{
	public vehicle Drive()
	{
		System.out.println("parent class drive");
		vehicle v = new vehicle();
		return v;
	}
	public vehicle chain()
	{
	System.out.println("parent class in chain");
	vehicle v =  new vehicle();
	return v;
		
	}
	
}
