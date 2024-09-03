package inheritence4;

public class child extends parent
	{
	
	
	public child(String name)
	{
		super(name);
	}
	@Override
	public void beak()
	{
		System.out.println(name +"     beaking beaking");
	}
	
	public static void main(String[] args)
	{
		child c = new child("german");
		c.beak();
	}
	
	}
