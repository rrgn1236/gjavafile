package gopal;

public class bus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bus b=new bus();
		b.bsize=12;
		b.bcol="blue";
		System.out.println(b.bsize);
		
		System.out.println("-------------------------------");
		
		bus b1=new bus();
		b.bsize=15;
		System.out.println(b.bsize);
		
		System.out.println("-------------------------------");
		
		bus b2=new bus();
		b.bsize=15;
	    b.bcol="pink";
	    b.beng="degel";
	    b.bcost=10000;
	    b.bmodel="benz";
	    System.out.println(b.bsize);
	    System.out.println(b.bcol);
	    System.out.println(b.beng);
	    System.out.println(b.bcost);
	    System.out.println(b.bmodel);
		
		
	
	}

}
