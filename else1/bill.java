package else1;

public class bill {

	public static void main(String[] args)
	{
		int units = 100;
		double price =3.4;
		if(units<=100)
		{
			System.out.println("The first slot is conformed");
		}
		else if(units>=101 && units<=200)
		{
			System.out.println("The second slot");
		}
		else if(units>=201 && units<=400)
		{
			System.out.println("The Third slot ");
		}
		else
		{
			System.out.println("No slot is applicable");
		}
	}

}
