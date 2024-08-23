package else1;

public class FB {

	public static void main(String[] args) {
		String user ="raja";
		String password ="gopal";
		String fname ="raju";
		String sname ="gopi";
		if(user=="raja" && password=="gopal")
		{
			System.out.println("Login Sucessfull");
		}
		else
		{
			System.out.println("login details are not correct");
			if(user =="raja")
			{
				System.out.println("Recollect security question");
				if(fname=="raju" && sname=="gopi") {
					System.out.println("The display the password is ------"+password);
				}
				else {
					System.out.println("You may try again");
				}
				
			}else
			{
				System.out.println("User name is not matched");
			}
				}
			
		
	}

}
