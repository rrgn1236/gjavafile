package arra;

public class arrray4 {

	public static void main(String[] args) 
	{
		 	String[] sub = {"Telugu","Hindi","English","Maths","Science","Social"};
		 	int [] marks= {67,56,18,79,77,69};
		 	double tmarks=0;
		 	String flag="pass";
		 	for(int i=0; i<=marks.length-1; i=i+1)
		 	{
		 		if(marks[i]<35)
		 		{
		 			flag="fail";
		 		}
		 		System.out.println(sub[i]+"-------"+marks[i]);
		 		tmarks=tmarks+marks[i];
		 	}
		 	System.out.println("Total Marks ----"+tmarks);
		 	double per=tmarks/(marks.length);
		 	System.out.println("The percentage is--------"+per);
		 	if(per>=36 && per<=50)
		 	{
		 		System.out.println("D Grade");
		 	}else if(per>=51 && per<=70)
		 	{
		 		System.out.println(" C grade");
		 	}else if(per>=71 && per<=85)
		 	{
		 		System.out.println("B Grade");
		 	}else if(per>=86 && per<=95)
		 	{
		 		System.out.println("A Grade");
		 	}else if(per>=96 && per<=100)
		 	{
		 		System.out.println("Super Student");
		 	}
		 	
		 	System.out.println("The final result is ---"+flag);
	
}	
}
