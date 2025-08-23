package day_6_Assignment;

public class Throws_exp {
	void add(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}
	void div(int a,int b) throws ArithmeticException {
		System.out.println("Div : "+(a/b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws_exp t=new Throws_exp();
		t.add(10,20);
		t.div(50,10);
		try {
			t.div(10, 0);
		}catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}

	}

}
