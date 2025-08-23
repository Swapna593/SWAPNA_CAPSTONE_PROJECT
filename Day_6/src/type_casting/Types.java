package type_casting;
public class Types {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		float f=a;
		System.out.println("Widening : ");
		System.out.println(f);
		System.out.println("Narrowing : ");
		int b=(int)f;
		System.out.println(b);
	}

}
