package Returntype;

public class Cardiologist extends Doctor
{

	public Doctor Doc ()
	{
		System.out.println("He treated chest pain,high bleedn presure");
		
		return new Doctor();
	}

}
