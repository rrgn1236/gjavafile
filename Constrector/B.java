package Constrector;

public class B extends A
{
	
	//int age=10;
	
	public void Arr()
	{
		System.out.println("This is child class age="+this.age);
		System.out.println("This is parent class age= "+super.age);
	}
        
	public static void main(String[] args)
	{
		B c = new B();
		c.Arr();
	}
}
