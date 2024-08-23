package arra;

public class array {

	public static void main(String[] args)
	{
		String[]sub= {"Telugu","Hindi","English","Maths","Science","Social"};
		int[] marks= {65,56,76,25,98,87};
		double tmarks =0;
		///System.out.println("Before itteration======="+tmarks);
		
		String flag="pass";
		for(int i=0; i<=marks.length-1; i=i+1)
		{ 
			if(marks[i]<35)
			{
				flag="fail";
			}
		

			System.out.println(sub[i]+"========="+marks[i]);
			tmarks=tmarks+marks[i];
			//System.out.println("After itterarion ======"+tmarks);
			//System.out.println("Total marks-------------"+tmarks);
		}
		System.out.println("Total marks-------------"+tmarks);
		double per =tmarks/(marks.length);
		System.out.println("The percentage of marks -----"+per);
		
		if(per>=35 && per<=50)
		{
			System.out.println("D Grade");
		}else if(per>51 && per<=70)
		{
			System.out.println("C Grade");
		}else if(per>71 && per<=85)
		{
			System.out.println("B Grade");
		}else if(per>86 && per<=95)
		{
			System.out.println("A Grade");
		}else if(per>96 && per<=100)
		{
		    System.out.println("Super Student");	
		}
        System.out.println("Std final Result ------"+flag);
	}

}
