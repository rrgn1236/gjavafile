package arra;

public class whil5 {

	public static void main(String[] args)
	{
		String[] sub= {"Telugu","Hindi","English","maths","Science","Social"};
     int[] marks = {56,76,66,64,49,67};
    // System.out.println(marks);
     
     //System.out.println(marks.length);
     
     //System.out.println(marks[0]);
     //System.out.println(marks[1]);
     //System.out.println(marks[2]);
     //System.out.println(marks[3]);
     //System.out.println(marks[4]);
     //System.out.println(marks[5]);
     
     // total marks,percentage of marks,pass or fail,grade
    // System.out.println(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5]);
     
     int  tmarks=0;//56+76+66+34+49+67
     System.out.println("Before itteration----"+tmarks);
     String flag="pass";
     
     for(int i=0; i<=marks.length-1; i=i+1)
     {
    	 if(marks[i]<35)
    	 {
    		 flag ="fail";
    	 }
    	 
    	// System.out.println(i);
    	 System.out.println(sub[i]+"===="+marks[i]);
    	 tmarks = tmarks + marks[i];
    	// System.out.println("Added value-------"+tmarks);
     }
     System.out.println("Total sum of marks------"+tmarks);
      double per =tmarks/(marks.length);
     System.out.println("Total percentage of marks-----"+per );
     
     if(per>=35 && per<=50)
     {
    	 System.out.println("D Grade");
     }else if(per>=51 && per<=70)
     {
    	 System.out.println("C Grade");
     }else if(per>=71 && per<=90)
     {
    	 System.out.println("B Grade");
     }else if(per>=91 && per<=100)
     {
    	 System.out.println("A Grade");
     }
     System.out.println("std final result ---"+flag);
     
     }
	}

