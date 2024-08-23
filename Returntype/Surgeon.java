package Returntype;

public class Surgeon extends Doctor
{
	public Doctor Doc()
	{
		System.out.println("Physically changing human body");
		return new Doctor();
	}

}
