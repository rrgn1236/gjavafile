package co.constrector;

public class test
{
	
	public static void main(String[] args)
	{
		
	
	adar a= new adar(1,"DAMMALAPADU","ADERTYUHU345");
	person p= new person(2,"RAJAGOPAL",23,a);
	System.out.println(p.getid());
	System.out.println(p.getage());
	System.out.println(p.getname());
	System.out.println("--------------------");
	System.out.println(p.getadr().getaid());
	System.out.println(p.getadr().getanum());
	System.out.println(p.getadr().getaadre());
	
	
	
	

}
}