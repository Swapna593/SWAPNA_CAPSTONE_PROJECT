package wrapper_classes;
class User_pass{
	String username;
	String password;
}
public class Username_password {
	static void updateCredentials(User_pass up) {
		up.username="Admin!23";
		up.password="Admin@1234";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_pass up=new User_pass();
		up.username="User123";
		up.password="User@1234";
		updateCredentials(up);//call by reference, so any changes made to the object ref will reflect
		System.out.println(up.username);
		System.out.println(up.password);

	}

}
