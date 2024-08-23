package else1;

public class ATM {

	public static void main(String[] args) {
	  int pin = 1325;
	  int Amount =10000;
	  int wd =4000;
	  if(pin==1325)
	  {
		  System.out.println("WELCOME TO HDFC BANK");
		  if(wd<Amount) 
		  {
			  System.out.println("TheSucessfully with draw balance amount is-----"+(Amount-wd));
			  
		  }
		  else
		  {
			  System.out.println("INSUFFICENT FUNDS");
		  }
		  
	  }
	  else	  
	  {
		  System.out.println("INCORRECT PIN");
	  }
		  

}
}
