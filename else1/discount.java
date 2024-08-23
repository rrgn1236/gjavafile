package else1;

public class discount {

	public static void main(String[] args) {
		int bill = 500;
		double ds1,ds2,ds3,ds4;
		ds1=(bill/100)*10;
		ds2=(bill/100)*20;
		ds3=(bill/100)*30;
		ds4=(bill/100)*40;
		double fbill;
		if(bill<100)
		{
			fbill=bill-ds1;
			System.out.println(ds1);
			System.out.println("Your amount"+"  "+fbill);
		}
		else if(bill<400)
		{
			fbill=bill-ds2;
			System.out.println(ds2);
			System.out.println("Your amount"+"  "+fbill);
		}
		else if(bill<600)
		{
			fbill=bill-ds3;
			System.out.println(ds3);
			System.out.println("Your amount"+"  "+fbill);
		}
		else 
		{
			fbill=bill-ds4;
			System.out.println(ds4);
			System.out.println("Your amount"+"  "+fbill);
		}
		     
	}

}
