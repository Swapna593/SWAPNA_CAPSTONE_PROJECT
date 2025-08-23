package interfaces;
interface Animal{//in interface all variables are static, static keyword is optional
	static String n="swa";//static
	String n2="pna";//static
	void eat();
	void sound();
	default void show() {
		System.out.println("hello");
	}
}
class Dog implements Animal{
	public void eat() {
		System.out.println("Dog eats : chicken");
	}
	public void sound() {
		System.out.println("Barks");
	}
}
public class Animal_Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		a=new Dog();
		a.eat();
		a.sound();
		System.out.println(Animal.n);

	}

}
