package day_4_Assignment;
//Create Hospital super class and access this class inside the patient child class and access properties from Hospital class. 
class Hospital{
	 String hos_name="Yashoda";
	
}
public class Patient extends Hospital{
	String patient_name="Mallika";
	void display() {
		System.out.println("Hospital name ="+hos_name);
		System.out.println("Patient name ="+patient_name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient();
		p.display();
	}
}
