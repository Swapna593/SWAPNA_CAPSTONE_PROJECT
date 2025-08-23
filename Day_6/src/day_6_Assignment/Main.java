package day_6_Assignment;
/*Object Casting with Inheritance 
1.Define an Animal class with a method makeSound().
2.Define subclass Dog:
oOverride makeSound() (e.g. "Woof!").
oAdd method fetch().
3.In main:
Dog d = new Dog();
Animal a = d;          // upcasting
a.makeSound();*/
class Animal{
	void makeSound() {
		System.out.println("Animal makes sound...");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog barks");
	}
	void fetch() {
		System.out.println("Fetch method of dog class");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Animal a=d;//upcasting
		a.makeSound();

	}

}
