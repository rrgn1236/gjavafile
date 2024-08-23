package Constrector;

public class E
{
	private int eid;
	private String ename;
	private double escl;
	private String edesg;
	public E(int eid, String ename, double escl, String edesg)
	{
		this.eid = eid;
		this.ename = ename;
		this.escl = escl;
		this.edesg = edesg;
	}
	
	public void display()
	{
		System.out.println("The id is="+eid);
		System.out.println("The name is="+ename);
		System.out.println("The salary is ="+escl);
		System.out.println("The designation is ="+edesg);
	}
	
              public static void main(String[] args)
			{
				E my = new E(1,"Rahul",10000.00,"developer");
				my.display();
				System.out.println("------------------");
				E mr = new E(1,"Raja",456666.6,"Devops");
				mr.display();
			}	
	
	
	
	

}
