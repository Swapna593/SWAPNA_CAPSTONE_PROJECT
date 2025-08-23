package wrapper_classes;

public class auto_boxing {
     //objects are allocated triple memory than primitive type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer a1=a;//auto boxing
		System.out.println(a1);
		
		Integer a2=20;
		int n=a2;//auto unboxing
		System.out.println(n);
		
		String s="20";
		Integer n2=Integer.parseInt(s);//parsing
		System.out.println(n2);
				
		int b=9087;
		String s2=Integer.toString(b);//converting int string
		System.out.println(s2);
		
		char c='2';
		if(Character.isDigit(c)) {
			System.out.println("digit");
		}
		else {
			System.out.println("not digit");
		}

	}

}
