package interface3;

class electroniccar
{
		public void elecar()
		{
			System.out.println("new electronic car");
		}

class car extends electroniccar
	{
			 public void car()
			 {
				 System.out.println("new model car");
			 }
	}
public class vehicle extends car
{
	public void vehicle()
	{
		System.out.println("vehicle");
	}
}

	public static void main(String[] args)
	{
		electroniccar v = new electroniccar();
		
		
	}
}