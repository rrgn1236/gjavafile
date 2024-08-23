package co.constrector;

public class A6
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		
		for(int  i=0; i<=a.length-1; i=i+1)
		{
			System.out.print(a[i] + "  ");
			
			if(a[i]%2==0)
			{
				System.out.print("it is even="+ a[i] + " ");
			}
		}
		System.out.println("-----------------");
		
		for (int j=a.length-1;  j>=0; j=j-1)
		{
			System.out.print(a[j] +"  ");
			
			

			
			if(a[j]%2!=0)
			{
				System.out.print("it is odd ="+a[j] + "  ");
			}
		}
		
	}

}
