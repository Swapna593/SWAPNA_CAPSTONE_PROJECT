package wrapper_classes;

public class Test {
	static void changePassword(String password) {
		password="New Password";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="Old Password";
	    Test.changePassword(password);
	    System.out.println("password : "+password);
		

	}

}
