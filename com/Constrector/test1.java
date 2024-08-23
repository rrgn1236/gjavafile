package com.Constrector;

public class test1
{

	public static void main(String[] args)
	{
	   person1 p = new person1();
	   p.Setpid(1);
	   p.Setpname("RajaGopal");
	   p.Setpage(25);
	   adar1 a = new adar1();
	   a.Setaid(1);
	   a.Setanum("RAMU123456");
	   a.Setaadre("SATTENAPALLI");
	   p.Setada(a);
	   
	   mobile1 m1 = new mobile1();
	   m1.Setmid(1);
	   m1.Setmnum(9876543210L);
	   m1.Setmsim("JIO");
	   mobile1 m2= new mobile1();
	   m2.Setmid(2);
	   m2.Setmnum(12345678L);
	   m2.Setmsim("BSNL");
	   mobile1[] m = {m1,m2};
	   p.setmob(m);
	   
	   System.out.println(p.getpid() +" "+p.getpname() +" "+ p.getpage() +" ");
	   System.out.println(p.getada().getid() + " "+p.getada().getanum()+" "+p.getada().getaadre());
	    mobile1[] mdata= p.getmob();
	    for(int i=0; i<=mdata.length-1; i=i+1)
	    {
	    	System.out.println(mdata[i].getmid()+"  "+mdata[i].getmnum()+ " "+mdata[i].getmsim());
	    }
	   

	}

}
