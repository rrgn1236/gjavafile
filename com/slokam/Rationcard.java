package com.slokam;

public class Rationcard
{
	static String Country="India";
         String cardnumber;
         String cardname;
         String cardaddress;
         String cardtype;
         
         
         void displayinfo()
         {
        	 System.out.println(cardnumber);
        	 System.out.println(cardname);
        	 System.out.println(cardaddress);
        	 System.out.println(cardtype);
        	 System.out.println(Country);
         }
        
        public static void main(String[] args)
        {
        	Rationcard R1 = new Rationcard();
        	
        	R1.cardnumber="R123467";
        	R1.cardname="Rahul";
        	R1.cardaddress="Near Post office";
        	R1.cardtype="Normal";
        	R1.displayinfo();
        	
        	System.out.println("---------------------------------");
        	
        	Rationcard R2 = new Rationcard();
        	R2.cardnumber="R234556677";
        	R2.cardname="Ramu";
        	R2.cardaddress="Dammalapadu";
        	R2.cardtype="Normal";
        	R2.displayinfo();
        	System.out.println("------------------------------------");
        	
            Rationcard R3 = new Rationcard();
            R3.cardnumber="R2345678";
            R3.cardname="Rajesh";
            R3.cardaddress="Sattenapalli";
            R3.cardtype="Normal";
            R3.displayinfo();
            System.out.println("--------------------------------------");
        	
      
        }
         
}
