package exception_prac;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(4);
		

	}

}
