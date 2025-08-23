package day_6_Assignment;
/*Convert an int to String using String.valueOf(...),
 *  then back with Integer.parseInt(...). Handle NumberFormatException.
 */
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Integer n : "+n);
		String s=String.valueOf(n);
		System.out.println("n as String : "+s);
		try {
		   int n2=Integer.parseInt("abc");
     	   System.out.println("n2 as int parsed from String s : "+n2);
		}catch(NumberFormatException e) {
			System.err.println("Pass int values only as it cause NumberFormatException if you pass string");
		}
		System.out.println("Program ends");

	}

}
