package string_prac;

public class String_conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//converting string to StringBuffer or StringBuilder
		String str="Hello";
		
		StringBuilder sb=new StringBuilder(str);
		sb.append(" World");
		System.out.println(sb);
		
		//converting StringBuffer to String 
		StringBuffer sbb=new StringBuffer("Java");
		String str2=new String(sbb);
		System.out.println(str2);
	}

}
