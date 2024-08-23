package gopal;

public class local {

	public static void main(String[] args) {
		 int data =500;
		 double ds1,ds2,ds3,ds4;
		 ds1=(data/100)*10;
		 ds2=(data/100)*20;
		 ds3=(data/100)*30;
		 ds4=(data/100)*40;
		 double total;
		 if(data<100) {
			 total=data-ds1;
			 System.out.println(ds1);
			 System.out.println("The discount 10%  " + "  "+ds1);
			 
		 }

	}

}
