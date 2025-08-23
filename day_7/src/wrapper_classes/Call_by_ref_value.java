package wrapper_classes;

public class Call_by_ref_value {
	String name="Test";
	void show( String name2) {
		name=name2;
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call_by_ref_value obj=new Call_by_ref_value();
		System.out.println(obj.name);//call by value
		obj.show("Mainclass");//call by reference
		System.out.println(obj.name);
	}

}
