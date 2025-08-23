package day_4_Assignment;
/*Runtime Polymorphism with constructor Chaining                    
 *create a class vehicle with a constructor that prints “Vehicle Created” 
Create a subclass Bike that override a method and uses super() in constructor*/

class Vehicle1{
	Vehicle1(){//constructor
		System.out.println("Vehicle Created!!");
	}
	void drive() {
		System.out.println("Vehicle is required to drive");
	}
}
class Bike extends Vehicle1{
	Bike(){//subclass constructor
		super();
		System.out.println("Bike is a 2 wheeler");
	}
	void drive() {//overriding
		System.out.println("Driving a bike ");
	}
	
}

public class cons_and_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();//Constructor chaining
		Vehicle1 v=new Vehicle1();
		b.drive();//run time polymorphism
		v.drive();
		
		
		
		

	}

}
