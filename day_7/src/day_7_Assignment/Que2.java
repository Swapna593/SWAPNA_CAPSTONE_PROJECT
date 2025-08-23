package day_7_Assignment;
/*1.Write a program where a method accepts an integer parameter and tries to change its value. 
 * Print the value before and after the method call.
 */
public class Que2 {
	public void change(int n) {
		n=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		Que2 q=new Que2();
		System.out.println(n);
		q.change(n);
		System.out.println(n);
		

	}

}
