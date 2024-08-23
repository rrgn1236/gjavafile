package else1;

public class bill1 {

	public static void main(String[] args)
	{
	    int units =40;
	    double price=3.5;
	    double bill;
	    if(units<=100)
	    {
	    	System.out.println("1 st stageee");
	    	 bill=units*price;
	    	 System.out.println("The 1 st Final bill is="+bill);
	    	}
	    else if(units>=101 && units<=200)
	    {
	    	System.out.println("2 nd stage is");
	    	bill=units*price;
	    	System.out.println("2 nd stage is="+bill);
	    }
	    else if(units>=201 && units<=400)
	    {
	    	System.out.println("3 rd stage is=");
	    	bill=units*price;
	    	System.out.println("The 3 Rd stage of Bill is ="+bill);
	    }else
	    {
	    	System.out.println("NO data -------------------");
	    }
	
		
	}

}
