package Static2;

public class static7{
	
	int a=90;
	static int b=80;
	
	static {
		System.out.println("static block");
		static7 b=new static7();
		b.m2();
	}
	
	
	public void m1() {
		
		System.out.println("insatnce block1");
		m2();
	}
	
	public void m2() {
		System.out.println("instance block2");
	}
	public static void main(String[] args)
	{
		static7 s=new static7();
		s.m1();
		s.m2();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void m1() {
		int houseloan=90000;
		int emi=40000;
		System.out.println(houseloan);
		System.out.println(emi);
	}
	public void m2(String gopal) {
		System.out.println(gopal);
		
	}
	
	public int m3() {
		
		
		return 0;
	}


	public static void main(String[] args){
		static7 s=new static7();
		s.m1();
		s.m2("rajgopal");
		

	}*/

}
