package assignments;
public class palind_num {
	public static void main(String[] args) {
		int n=12321;
		int n1=n;
		int rev=0;
		int d=0;
		while(n!=0) {
			d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
		if(n1==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
