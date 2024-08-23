package Constrector;

public class data
{
	
	public static void main(String[] args)
	{
		person p = new person();
		p.setid(1);
		p.setname("RAJU");
		p.setage(34);
//		System.out.println("-----------");
//        System.out.println(p.getid());	
//        System.out.println(p.getname());
//        System.out.println(p.getage());
//		
		adhar a= new adhar();
		a.setaid(1);
		a.setaadre("rdfyduidug");
		a.setanum("y3te7rt");
		p.setadar(a);
		
		System.out.println(p.getid());
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getadar().getaid()+"   "+p.getadar().getanum()+ "  "+p.getadar().getaadre());
		System.out.println();
		System.out.println();
		
		
		
	}
}
//System.out.println("---------------");
//System.out.println(a.getaid());
//System.out.println(a.getaadre());
//System.out.println(a.getanum());