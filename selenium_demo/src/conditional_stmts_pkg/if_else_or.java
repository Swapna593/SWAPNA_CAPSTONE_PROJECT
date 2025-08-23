package conditional_stmts_pkg;

public class if_else_or {

	public static void main(String[] args) {
           char ch='a';
           if(ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        	   System.out.println(ch+" is Vowel"); 
           }
           else {
        	   System.out.println(ch+" is Consonent"); 
           }
	}

}
