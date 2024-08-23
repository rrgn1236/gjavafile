package co.constrector;

public class A4
{

	 public static void main(String[] args)
	  {
		 
	  
	   int[] A = {1,2,3,4,5};
		
		for(int i=A.length-1; i>=0; i = i-1)
		{
			if(A[i] % 2 != 0)
			{
				System.out.println(A[i]);
			}
		}
}
}