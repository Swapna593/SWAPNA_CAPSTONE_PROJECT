package inheritance;
class Veh{
	void drive(String veh) {
		System.out.println("Driving "+veh);
	}
}

class  Car extends Veh{
	void seats(int count) {
		System.out.println("Seats count : "+count);
	}
	void wheels(int wheels) {
		System.out.println("Wheels count : "+wheels);
	}
	void precaution() {
		System.out.println("seatbelt is must");
	}
	
}

class Scooter extends Veh{
	void wheels(int wheels) {
		System.out.println("Wheels count : "+wheels);
	}
	void precaution() {
		System.out.println("Wear helmet to be safe");
	}
	
}

public class Heirarchical_inheritance {

	public static void main(String[] args) {
       Scooter sc=new Scooter();
       sc.drive("Scooter");
       sc.wheels(2);
       sc.precaution();
       System.out.println("-------------------------");
       Car c=new Car();
       c.drive("Car");
       c.seats(4);
       c.wheels(4);
       c.precaution();
       
       
       
       
	}

}
