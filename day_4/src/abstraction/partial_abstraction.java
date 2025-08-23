package abstraction;

abstract class Animal_2{
	abstract void eat();
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog_1 extends Animal_2{
	void eat() {
		System.out.println("Dog eats both veg and non_veg");
	}
	void sound() {
		System.out.println("Dog barks");
	}
	
}
class Tiger extends Animal_2{
	void eat() {
		System.out.println("Tiger eats only meat");
	}
	void sound() {
		System.out.println("Tiger roars");
	}
}
public class partial_abstraction {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_2 a1;
		a1=new Dog_1();
		a1.eat();
		a1=new Tiger();
		a1.eat();

	}

}
