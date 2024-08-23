package else1;

public class facebook {

	public static void main(String[] args) {
		String user ="raju";
		String password ="jonn";
		String fname ="nehaa";
		String sname ="Rahul";
		if (user=="raju" && password=="johnn")
		{
			System.out.println("Login Succefully");
		}
		else
		{
			System.out.println("Acount not found");
             if(user=="raju")
             {
            	 System.out.println("Recover the password");
            	 if(fname=="nehaa" && sname=="Rahul")
            	 {
            		System.out.println("the password is------"+password); 
            	 }
            	 else
            	 {
            		 System.out.println("Try again");
            	 }
             }
             else 
             {
            	 System.out.println("Invalid user name");
             }
			}
		}
			
	}

