package else1;

public class else2 {

	public static void main(String[] args) {
		  int cost = 2000;
		  double ds1,ds2;
		  ds1=(cost/100)*10;
		  ds2=(cost/100)*20;
		  double fprice;
		  
		  if(cost>=100 && cost<300){
			  fprice=cost-ds1;
			  System.out.println(ds1);
			  System.out.println("discount 10 % is" + "  "+fprice);
		  }
		  if(cost)
		  {
			  fprice=cost-ds2;
			  System.out.println(ds2);
			  System.out.println("discount 20 % is "+ "   "+fprice);
		  }
				  
		  
	}

}
