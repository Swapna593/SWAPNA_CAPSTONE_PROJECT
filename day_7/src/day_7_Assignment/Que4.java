package day_7_Assignment;
/*3.Write a Java program to pass primitive data types to a method
 *  and observe whether changes inside the method affect the original variables.
 */
public class Que4 {
    public void passPrimitive(int a) {
    	a=80;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que4 q=new Que4();
		int a=9;
		q.passPrimitive(a);
		System.out.println(a);

	}

}
