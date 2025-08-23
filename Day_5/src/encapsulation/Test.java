package encapsulation;

public class Test {
	void setName(String name) {
		System.out.println(name);;
	}
	void getName() {
		this.setName("Swapna");
		System.out.println("Welcome to java Programming!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t=new Test();
        t.getName();
	}

}
