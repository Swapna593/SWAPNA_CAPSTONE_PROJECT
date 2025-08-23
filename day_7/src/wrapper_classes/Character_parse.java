package wrapper_classes;

public class Character_parse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A";
		char c=s.charAt(0);
		System.out.println(c);
		
		String s2="Hello";
		char[] ch=s2.toCharArray();
		System.out.println(ch);
		
		String st="Hello12";
		int digit=0;
		int char_count=0;
		char[] ca=st.toCharArray();
	    for(char b:ca) {
	    	if(Character.isDigit(b)) {
	    		System.out.println("Digit");
	    		digit++;
	    	}
	    	else {//isLetter method is also available
	    		System.out.println("Character");
	    		char_count++;
	    	}
	    }
	    System.out.println("digit count :"+digit);
	    System.out.println("Char count : "+char_count);
			
		
		

	}

}
