package Returntype;

public class Dermatologist extends Doctor
{

	public Doctor Doc()
	{
		System.out.println("He treated the skin conditions");
		return  new Doctor();
	}
	
	
}
