package Constrector;

public class D
{
	public static void main(String[] args)
	{
		C my = new C();
		my.setid(1);
		my.setename("RAJAGOPAL");
		my.setedesg("Developer");
		my.setescl(456666.66);
		System.out.println("Employe id is="+my.geteid());
		System.out.println("Employe name is="+my.getename());
		System.out.println("Employe Salary is="+my.getescl());
		System.out.println("Employe designation is="+my.getedesg());
	}

}
