package string_prac;

public class Stringbuff_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb.capacity());//default value (capacity) we define more than this
		System.out.println(sb.length());
		System.out.println(sb.substring(1,5));

	}

}
