package day_4_Assignment;
/*Create an abstract class SmartDevice with methods like turnOn(), turnOff(), and performFunction(). 
Create child classes: 
SmartPhone: performs calling and browsing. 
SmartWatch: tracks fitness and time. 
SmartSpeaker: plays music and responds to voice commands. */
abstract class SmartDevice{
	void turnOn() {
		System.out.println("Turning on Smart Device");
	}
	void turnOff() {
		System.out.println("Turning off Smart Device");
	}
	abstract void performFunction();
}
class SmartPhone extends SmartDevice{
	void performFunction() {
		System.out.println("performs calling and browsing.");
	}
	
}
class SmartWatch extends SmartDevice{
	void performFunction() {
		System.out.println("tracks fitness and time");
	}
}
class SmartSpeaker extends SmartDevice{
	void performFunction() {
		System.out.println("plays music and responds to voice commands.");
	}
}

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice s;
		s=new SmartWatch();
		s.turnOn();
		s.performFunction();

	}

}
