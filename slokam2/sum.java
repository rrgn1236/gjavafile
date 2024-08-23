package slokam2;

public class sum
{
  /* public static void main(String[] args)
{
	int sum=0;
	for(int i=1 ;i<=1000;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);*/

	public static void main(String[] args)
	{
		
	int n = 753;
	int r;
	int rev = 0;
	
	while(n>0) {
		
		r = n%10;
		rev = rev*10+r;
		n = n/10;
		System.out.println(rev);
	}
	System.out.println(rev);
	}
}
