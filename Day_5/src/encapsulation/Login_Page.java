package encapsulation;

public class Login_Page {
	public String user_name="Swapna";
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login_Page p=new Login_Page();
		p.setPassword("1234");
		System.out.println("User Nmae : "+p.user_name);
		System.out.println("Password :"+p.getPassword());
		
		

	}

}
