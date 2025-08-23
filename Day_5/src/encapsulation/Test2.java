package encapsulation;
//Sample program this calling method inside the same class
public class Test2 {
	Test2(String name){
		System.out.println(name);
	}
	Test2(){
		this("This is Test2 parameterized constructor");
		System.out.println("Welcome to my space");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2();
	}

}
