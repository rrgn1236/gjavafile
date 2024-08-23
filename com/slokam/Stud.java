package com.slokam;

public class Stud
{
	
	
	double marks(int h, int t, int e, int m,int sci, int soc)
	{
		double per=(h+t+e+m+sci+soc)/6;
		return per;
	}
	boolean passorfail(int h,int t,int e,int m,int sci,int soc)
	{
		if(h>=35 && t>=35 && e>=35 && m>=35 && sci>=35 &&  soc>=35)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
	  Stud s = new Stud();
	  boolean Result= s.passorfail(78, 80, 96, 56, 88, 12);
	  System.out.println(s);
	  System.out.println("Result="+Result);
	  double per=s.marks(78, 80, 96, 56, 88, 12);
	  System.out.println("Percentage="+per);
	  
	  
	  

	}

}
