package co.constrector;

public class test1
{
	public static void main(String[] args)
	{
		adar1 n = new adar1(1,"345565666","ABCD123456");
		person1 p = new person1(1,"RAHEEM",25,n);
		System.out.println(p.getid());
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getadr().getaid()+"  "+p.getadr().getanum()+"  "+p.getadr().getaadre());
	

	}

}
