package com.slokam;

public class passport
{
  static String passport="india";
  String passportnumber; 
  String passportpersion;
  String dateofissue;
  String dateofexpiry;
  int age;
  
  dog isEligibleForPassport()
  {	
	  dog d = new dog();
      return d;
      
  }
//   void displayinfo()
//   {
//	   if (isEligibleForPassport())
//	   {
//		   System.out.println(passportnumber);
//		   System.out.println(passportpersion);
//		   System.out.println(dateofissue);
//		   System.out.println(dateofexpiry);
//		   System.out.println(age);
//		   System.out.println(passport);
//		   
//	   }else
//	   {
//		   System.out.println("Not eligible for passport");
//		   
//	   }
//}
   public static void main(String[] args)
   {
//	   passport p1 =new passport();
//	   p1.passportnumber="R123456";
//	   p1.passportpersion="Gopal";
//	   p1.dateofissue="23-06-2024";
//	   p1.dateofexpiry="31-12-2030";
//	   p1.age=21;
//	   p1.displayinfo();
//	  System.out.println("----------------------");
//	  
//	  passport p2 = new passport();
//	  p2.passportnumber="G123456";
//	   p2.passportpersion="RAJAGopal";
//	   p2.dateofissue="23-06-2025";
//	   p2.dateofexpiry="31-12-2030";
//	   p2.age=17;
//	   p2.displayinfo();
	   
	   passport p = new passport();
	   dog d = p.isEligibleForPassport();
	   System.out.println(d);
	   
	   
	   int[] a  = new int[10];
	   
	   System.out.println(a);
	   
	   int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	   
	   System.out.println(a1[3]);
	   
	   int[] a2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	}
	   
   }
      

