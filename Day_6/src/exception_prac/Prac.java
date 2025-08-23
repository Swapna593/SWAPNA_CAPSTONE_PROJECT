package exception_prac;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		try {
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("It execute irrespective of exception");
		}

	}

}//why finally?
//to close files
//to release some connection or network
//to clear something

