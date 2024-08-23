package com.slokam;

public class calc3
{
    double marksper(int h,int t,int e, int m, int sc, int soc)
    {
    	
    	double per =(h+t+e+m+sc+soc)/6;
    	
    	return per;
    }
    boolean passorfail(int h,int t,int e, int m, int sc, int soc)
    {
    	if(h>=35 && t>=35 && e>=35 && m>=35 && sc>=35 && soc>=35)
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
	   calc3 k = new calc3();
	   boolean pass=k.passorfail(45, 50, 22, 44, 55, 55);
       System.out.println("Result="+pass);
	   double per =k.marksper(45, 50, 22, 44, 55, 55);
	   System.out.println(k);
	   System.out.println("Percentage="+per);
       
	}

}
