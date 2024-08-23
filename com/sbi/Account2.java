package com.sbi;

public class Account2
{
   static String location= "Hydrebad";
     String Hostel;
     String owner;
     int Rent;
     boolean ACavaliblity;
     
     
     void credit(int cr)
     {
    	 Rent = Rent + cr;
     }
     void debit(int dr)
     {
    	 Rent = Rent - dr;
     }

     void displayinfo()

     {
    	 System.out.println(Hostel);
    	 System.out.println(owner);
    	 System.out.println(Rent);
    	  checkACavaliblity();
     }

        void checkACavaliblity()
	{
		if(ACavaliblity)
		{
			System.out.println("Ac is there");
		}else
		{
			System.out.println("Ac is not avaliable");
		}
		
		
		
	}
        public static void main(String[] args)
        {
        	Account2 a1 =new Account2();
        	a1.Hostel="Happyhome";
        	a1.owner="Ganesh";
        	a1.Rent=67000;
            a1.ACavaliblity=true;
            a1.displayinfo();
            a1.credit(5000);
            System.out.println(a1.Rent);
            a1.debit(40000);
            System.out.println(a1.Rent);
        }
}