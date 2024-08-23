package else1;

public class insta {

	public static void main(String[] args) {
		
		String userid ="rahul";
		String password ="ramu";
		String q1 ="raju";
		String q2="raj";
		if(userid=="rahul"  && password=="ramu")
		{
		System.out.println("Succesfully login");	
		}else {
			System.out.println("user name is wrong");
			if(userid=="rahul") {
				System.out.println("Verify Securityu questions");
				if(q1=="raju" && q2=="raj") {
					System.out.println("The password is ------"+password);
				}else {
					System.out.println("Try again the verification");
				}
				
			}else {
				System.out.println("User id is failed");
			}
			}
		}
	}


