package exception_prac;
class Test{
	void show() {
		System.out.println("test show()");
	}
}
class Test2 extends Test{
	void show() {
		System.out.println("test2 show()");
	}
	
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num=null;
		try {
			System.out.println(num.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}try {
		   Test t=new Test2();
		   Test2 t2=(Test2)t;
		}catch(ClassCastException e) {
			System.out.println(e);
		}
		
	}

}
