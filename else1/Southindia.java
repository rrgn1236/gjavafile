package else1;

public class Southindia {

	public static void main(String[] args) {
		int  cloth=200000;
		double ds1,ds2,ds3,ds4,ds5;
		ds1=(cloth/100)*10;
		ds2=(cloth/100)*20;
		ds3=(cloth/100)*30;
		ds4=(cloth/100)*40;
		ds5=(cloth/100)*90;
		double tprice;
		if(cloth<100)
        {
      	  tprice=cloth-ds1;
      	  System.out.println(ds1);
      	  System.out.println("The 10 % discount is applicable:"+tprice);
        }
		else if(cloth<200)
        {
      	  tprice=cloth-ds2;
      	  System.out.println(ds2);
      	  System.out.println("The 20 % discount is applicable:"+tprice);
        }
		else if(cloth<500)
        {      	  tprice=cloth-ds3;
      	  System.out.println(ds3);
      	  System.out.println("The 30 % discount is applicable:"+tprice);
        }
		else if(cloth<700)
        {
      	  tprice=cloth-ds4;
      	  System.out.println(ds4);
      	  System.out.println("The 40 % discount is applicable:"+tprice);
        }
		else if(cloth<1000 || cloth>=1000)
        {
      	  tprice=cloth-ds5;
      	  System.out.println(ds5);
      	  System.out.println("The 90 % discount is applicable:"+tprice);
        }
	}

}
