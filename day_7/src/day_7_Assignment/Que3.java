package day_7_Assignment;
/*Create a method that takes two integer values and swaps them.
 *  Show that the original values remain unchanged after the method call.
 */
public class Que3 {
    public void swap(int n1,int n2) {
    	n1=n1+n2;
    	n2=n1-n2;
    	n1=n1-n2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 q=new Que3();
		int n1=10;
		int n2=20;
		System.out.println(n1+"  " +n2);
		q.swap(n1, n2);
		System.out.println(n1+"  " +n2);

	}

}
