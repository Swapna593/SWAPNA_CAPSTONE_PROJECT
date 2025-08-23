package day_4_Assignment;
/*create multilevel inheritance for 

//Vehicle 

//Four_wheeler 

//Petrol_Four_Wheeler 

//FiveSeater_Petrol_Four_Wheeler 

//Baleno_FiveSeater_Petrol_Four_Wheeler */
class Vehicle{
	void drive(String vehicle) {
		System.out.println("Drive using "+vehicle);
	}
	
}
class Four_Wheeler extends Vehicle{
	void wheels(int count) {
		System.out.println("Vehicle Wheels count "+count);
	}
	
}
class Petrol_Fourwheeler extends Four_Wheeler{
	void fuel(String fuel) {
		System.out.println("Fuel used is "+fuel);
	}
	
}
class Five_seater_petro_fourwheeler extends Petrol_Fourwheeler{
	void seater(int seat) {
		System.out.println("Seater count "+seat);
	}
	
}
class Baleno_Petrol_Fiveseater_Fourwheeler extends Five_seater_petro_fourwheeler{
	void model(String mod) {
		System.out.println("Model is "+mod);
	}
	
}

public class mul_inherit {

	public static void main(String[] args) {
		Baleno_Petrol_Fiveseater_Fourwheeler b=new Baleno_Petrol_Fiveseater_Fourwheeler();
		b.drive("Car");
		b.wheels(4);
		b.fuel("Petrol");
		b.seater(5);
		b.model(" Maruti Baleno");
	}

}
