package type_casting;
class Test{
	void show() {
		System.out.println("show method of Test ");
	}
}
class Test2 extends Test{
	void show() {
		System.out.println("show method of Test2!! ");
	}
	void display() {
		System.out.println("display method of Test ");
	}
}

public class Class_Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t;
		t=new Test2();//Upcasting
		t.show();//overridden method executes
		Test2 t1=(Test2)t;
		t1.show();
		t1.display();
		

	}

}
