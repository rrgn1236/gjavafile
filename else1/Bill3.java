package else1;

public class Bill3 {

	public static void main(String[] args)
	{
          int units=280;
          double price;
          double bill;
          if(units<=100)
          {
        	  System.out.println("The first stage =?");
        	  price=4;
        	  bill=price*units;
        	  System.out.println("The data of first slab is="+bill);
          }
          else if(units>=101 && units<=200)
          {
        	  System.out.println("The second data is=?");
        	  price=8;
        	  bill=(units-100)*price+400;
        	  System.out.println("The 2 mnd slab is="+bill);
          }
          else if(units>=201 && units<=400)
          {
        	  System.out.println("The 3 rd block is=?");
        	  price=20;
        	  bill=(units-200)*price+400+800;
        	  System.out.println("The 3 rd stage is="+bill);
          }
          else
          {
        	  System.out.println("The bill is not found");
          }
	}

}
