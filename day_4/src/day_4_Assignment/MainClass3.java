package day_4_Assignment;
//Hierarchical Inheritance
class Hospital_1{
	void display() {
		System.out.println("Yashoda Hospital");
	}
}
//Hospital subclass
class Doctor extends Hospital_1{
	String designation="Doctor";
	void display_designation() {
		System.out.println(designation);
	}
}
//Doctor subclasses
class Gynac extends Doctor{
	String spec="gynacologist";
	
}
class Endo extends Doctor{
	String spec="Endocrynologist";
}
class Cardiac extends Doctor{
	String spec="Cardiologist";
}
//Cardiac subclasses
class Operation extends Cardiac{
	String dept="Operation";
}
class OPD extends Cardiac{
	String dept="OPD";
}
//Hospital Subclasses
class Nurse extends Hospital{
	String designation="Nurse";
}

class Accountant extends Hospital_1{
	String designation="Accountant";
}
//Accountant subclasses
class Payments extends Accountant{
	String dept="Payments";
}
class Documentation extends Accountant{
	String dept="Documention";
}

public class MainClass3 {

	public static void main(String[] args) {
		Gynac g=new Gynac();
		g.display();

	}

}
