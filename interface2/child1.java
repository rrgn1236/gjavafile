package interface2;

public class child1 implements parent1,parent2
	{

	@Override
	public void sweet()
		{
			System.out.println("sweet");
		}

	@Override
	public void beak()
		{
			System.out.println("beak");
			
		}
	public void free()
		{
			System.out.println("free");
		}
	
		public static void main(String[] args)
		{
			child1 c = new child1();
			c.beak();
			c.free();
			c.sweet();
			
		}
	   
	}
