package constructors;

class Vehicle{
	int speed=80;
}
class Car extends Vehicle{
	int speed=70;
	void display() {
		System.out.println(speed);//70
		System.out.println(super.speed);//80
		System.out.println(this.speed);//70
	}
	
}

public class super_this_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.display();

	}

}
