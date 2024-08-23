package else1;

public class shop {

	public static void main(String[] args) {
          int cost =1200;
          double ds1,ds2,ds3,ds4,ds5;
          ds1=(cost/100)*10;
          ds2=(cost/100)*20;
          ds3=(cost/100)*30;
          ds4=(cost/100)*40;
          ds5=(cost/100)*98;
          double fcost;
          if(cost<100 )
          {
        	  fcost=cost-ds1;
        	  System.out.println(ds1);
        	  System.out.println("The 10 % discount is applicable:"+fcost);
          }
          else  if(cost<200)
          {
        	  fcost=cost-ds2;
        	  System.out.println(ds2);
        	  System.out.println("The 20 % discount is applicable:"+fcost);
          }
          else if(cost<300)
          {
        	  fcost=cost-ds3;
        	  System.out.println(ds3);
        	  System.out.println("The 30 % discount is applicable:"+fcost);
          }
          else if(cost<400)
          {
        	  fcost=cost-ds4;
        	  System.out.println(ds4);
        	  System.out.println("The 40 % discount is applicable:"+fcost);
          }
          else if(cost<1800)
          {
        	  fcost=cost-ds5;
        	  System.out.println(ds5);
        	  System.out.println("The 98 % discount is applicable:"+fcost);
          }
}
}
