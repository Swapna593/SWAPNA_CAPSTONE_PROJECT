package string_prac;

public class Methods_string {

	public static void main(String[] args) {
		String s="   ";
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		String s2="Hello";
		System.out.println(s2.charAt(2));
		System.out.println(s2.lastIndexOf("l"));
		System.out.println(s2.codePointAt(0));//returns ascii value of character
		System.out.println(s2.codePointBefore(1));//returns ascii value of th char in string previous to specified index
		System.out.println(s2.codePointCount(0, 4));
		System.out.println(s2.equals("hello"));
		System.out.println(s2.equalsIgnoreCase("hello"));
		System.out.println(s2.contains("ll"));

	}

}
