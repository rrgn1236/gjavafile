package com.Constrector;

public class test2
{
	public static void main(String[] args)
	{
		person2 p= new person2();
		p.Setpid(1);
		p.Setpname("RAJAGOPAL");
		p.Setpage(25);
		
		adar2 a = new adar2();
		a.Setaid(1);
		a.Setanum("RAJAGOP123456");
		a.Setaloc("NARASARAOPETA");
		p.Setada(a);
		
		mobile2 m1=new mobile2();
		m1.Setmid(1);
		m1.Setmnum(9876543210L);
		m1.Setmsim("JIO");
		
		mobile2 m2 =new mobile2();
		m2.Setmid(2);
		m2.Setmnum(123456789L);
		m2.Setmsim("ARTEL");
		
		mobile2[] mob= {m1,m2};
		p.Setmob(mob);
		
		System.out.println(p.getpid() +" "+p.getpname() +" "+p.getpage());
		System.out.println(p.getada().getaid()+" "+p.getada().getanum()+" "+p.getada().getaloc());
        
		mobile2[] mdata= p.getmob();
		
		for (int i=0; i<=mdata.length-1; i=i+1)
          {
			System.out.println(mdata[i].getid()+"  "+mdata[i].getmnum()+"  "+mdata[i].getmsim());
	
          }

}
}
