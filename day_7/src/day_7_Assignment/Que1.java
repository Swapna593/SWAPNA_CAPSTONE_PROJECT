package day_7_Assignment;
/*Wrapper classes
1.Check if character is a Digit
2.Compare two Strings
3.Convert using valueof method
4.Create Boolean Wrapper usage
5.Convert null to wrapper classes*/
public class Que1 {

	public static void main(String[] args) {
		char ch='1';//1
		System.out.println(Character.isDigit(ch));
		
		String s1="Hello";
		String s2="Hel";
		System.out.println(s1.compareTo(s2));//2
		
		String s="234";
		System.out.println(s.valueOf(s));//3
		
		boolean b=true;
		Boolean b1=b;
		System.out.println(b1);//4
		
		Integer s3=(Integer)null;
		System.out.println(s3);//5
	}

}
