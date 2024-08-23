package Returntype;

public class Doctor
{
 
	public Doctor Doc()
	{
		System.out.println("I WILL ALL THE CONDITIONS");
		return new Doctor();
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("----------");
		Doctor B = new Cardiologist();
		B.Doc();
		System.out.println("-----------");
		Doctor c = new Dermatologist();
		c.Doc();
		System.out.println("------------");
		Doctor D = new Gastroenterologist();
		D.Doc()	;
		System.out.println("------------");
		Doctor E = new optometrist();
		E.Doc();
		System.out.println("-----------");
        Doctor F = new Surgeon();
        F.Doc();
		
		
		
	}
}
