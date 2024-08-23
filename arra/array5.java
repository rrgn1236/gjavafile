package arra;

public class array5 {

	public static void main(String[] args)
	{
		String[] sub= {"Telugu","Hindi","English","Maths","Science","Social"};
	int[] marks= {34,56,66,87,88,66};
	int tmarks=0;
	String flag="true";
	for(int i=0; i<=marks.length-1; i=i+1)
	{
		if(marks[i]<35)
		{
			flag="fail";
		}
		System.out.println(sub[i]+"-----------"+marks[i]);
		tmarks=tmarks+marks[i];
		
		
	}
	System.out.println("The Total marks="+tmarks);
	double per= tmarks/(marks.length);
	System.out.println("The percentage of marks is:"+per);
	if(per>=35 && per<=50)
	{
		System.out.println("D Grade");
		
	}else if(per>=51 && per<=65)
	{
		System.out.println("C Grade");
		
	}else if(per>=66 && per<=85)
	{
		System.out.println("B Grade");
	}else if(per>=86 && per<=95)
	{
		System.out.println("A Grade");
	}else if(per>=96 && per<=100)
	{
		System.out.println("Super student");
	}
	   System.out.println("The result is"+flag);

	}
	}

       
