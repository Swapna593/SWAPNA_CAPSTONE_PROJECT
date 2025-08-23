package encapsulation;

public class Test3 {
	void display(Test3 t) {
		System.out.println("Current class object ");
	}
	void show() {
		display(this);//here this refers to the current class object
		System.out.println(" Hello ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t=new Test3();
		t.show();

	}

}
