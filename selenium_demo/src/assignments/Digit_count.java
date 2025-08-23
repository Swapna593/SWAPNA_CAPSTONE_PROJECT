package assignments;

public class Digit_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1235;
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		System.out.println("Digit count is "+c);

	}

}
