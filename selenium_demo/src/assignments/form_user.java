package assignments;
import java.util.Scanner;
public class form_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc.nextLine();
		System.out.println("Enter contact : ");
		long contact=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter email : ");
		String email=sc.nextLine();
		System.out.println("Enter password : ");
		String password=sc.nextLine();
		System.out.println("Confirm password : ");
		String con_pass=sc.nextLine();
		
		System.out.println("Name            : "+name);
		System.out.println("contact         : "+contact);
		System.out.println("email           : "+email);
		if(password.equals(con_pass)) {
			System.out.println("logged in successfully!!");
		}
		else {
			System.err.println("Invalid password  ");
		}
	}

}
