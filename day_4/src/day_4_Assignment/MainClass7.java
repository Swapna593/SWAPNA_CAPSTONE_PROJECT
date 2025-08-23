package day_4_Assignment;
/*Create a base class Vehicle with method start(). 
Derive Car, Bike, and Truck from it and override the start() method. 
Create a static method that accepts Vehicle type and calls start(). 
Pass different vehicle objects to test polymorphism. */

abstract class Vehicle2{
	abstract void start();
}
class Car extends Vehicle2{
	void start() {
		System.out.println("Starting car");
	}
}
class Bike1 extends Vehicle2{
	void start() {
		System.out.println("Starting bike");
	}
}
class Truck extends Vehicle2{
	void start() {
		System.out.println("Starting truck");
	}
}

public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 v;
		v=new Car();
		v.start();
		v=new Bike1();
		v.start();
		v=new Truck();	
		v.start();

	}

}
