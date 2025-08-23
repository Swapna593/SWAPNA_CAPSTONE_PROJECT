package inheritance;
class Animal_1{
	void eat(){
		System.out.println("Animal Eats to survive");
	}
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog_1 extends Animal_1{
	void eat() {
		System.out.println("Dog eats both veg and non_veg");
	}
	void sound() {
		System.out.println("Dog barks");
	}
	
}
class Tiger extends Animal_1{
	void eat() {
		System.out.println("Tiger eats only meat");
	}
	void sound() {
		System.out.println("Tiger roars");
	}
}
public class Meth_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_1 a=new Animal_1();
		a.eat();
		a.sound();
		System.out.println("---------------------------");
		Dog_1 d=new Dog_1();
		d.eat();
		d.sound();
		System.out.println("---------------------------");
		Tiger t=new Tiger();
		t.eat();
		t.sound();
		

	}

}
