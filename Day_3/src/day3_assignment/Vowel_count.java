package day3_assignment;
public class Vowel_count {
	public static void main(String[] args) {
		String s="Hello";
		int c=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
				c++;
			}
		}
		System.out.println("Vowels count : "+c);
	}
}
