package com.slokam;

public class Stud1
{

	double marks(int h,int t,int e,int m,int sc,int soc)
	{
		double per=(h+t+e+m+sc+soc)/6;
		return per;
	}
	boolean trueorfalse(int h,int t,int e,int m,int sc,int soc)
	{
		boolean flag;
		{
			if(h>=35 && t>=35 && e>=35 && m>=35 && sc>=35 && soc>=35)
			{
				flag= true;
			}
			else
			{
				flag= false;
			}
			return flag;
		}
	}
	
        public static void main(String[] args)
        {
        	Stud1 s =new Stud1();
        	boolean Result =s.trueorfalse(54, 89, 99, 98, 89, 80);
        	System.out.println(s);
        	System.out.println("Result="+Result);
        	double per=s.marks(54, 89, 99, 98, 89, 10);
        	System.out.println("Percentage="+per);
        	
        	
        }

}