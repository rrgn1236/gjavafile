package inhritence1;

public class child extends parent
{
	int bonus = 2000;

	public static void main(String[] args)
	{
		child p = new child();
		System.out.println("Salary:-"+p.sal);
		System.out.println("bonus"+p.bonus);
		
	}

}
