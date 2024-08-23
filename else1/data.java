package else1;

public class data {

	public static void main(String[] args) {
		 int data =500;
		 double ds1,ds2,ds3,ds4;
		 ds1=(data/100)*10;
		 ds2=(data/100)*20;

		 double total;
		 if(data<501) {
			 total=data-ds1;
			 System.out.println(ds1);
			 System.out.println("The discount 10%  " + "  "+ds1);
		 }
		 if(data<200) {
			 total=data-ds2;
			 System.out.println(ds2);
			 System.out.println("The 29% of data   "+"  "+ds2);
		 }
		 if(data<300) {
			 
		 }
	}

}
