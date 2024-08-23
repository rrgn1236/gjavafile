package Returntype;

public class Gastroenterologist extends Doctor
{
	
	public Doctor Doc()
	{
		System.out.println("Treated on digestive");
		return new Doctor();
	}

}
