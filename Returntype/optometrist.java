package Returntype;

public class optometrist extends Doctor
{
	public Doctor Doc()
	{
		System.out.println("He will do the visible problems");
		return new Doctor();
	}

}
