package else1;

public class bill2 {

	public static void main(String[] args)
	{
               int units=510;
               double price;
               double bill;
               if(units<=100)
               {
             	   System.out.println("The 1 st stage");
             	   price=4;
             	   bill=units*price;
             	   System.out.println("The 1 st stage of data is="+bill);
             	   
               }else if(units>=101 && units<=200)
               {
            	   System.out.println("The 2 nd stage of data is=");
            	   price=8;
            	   bill=units*price;
            	   System.out.println("The 2 nd stage is="+bill);
               }
               else if(units>=201 && units<=400)
               {
            	   System.out.println("The stage 3 is=");
            	   price=20;
            	    bill=units*price;
            	   System.out.println("The 3 rd stage is="+bill);
            	   
               }
               else
               {
            	   System.out.println("Not find any data");
               }
               
               

	}

}
