package enum_prac;

public class Days {
enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day t=Day.Monday;
		if(t==Day.Sunday ||t==Day.Sunday) {
			System.out.println("Weekend");
		}
		else {
			System.out.println("Weekday");
		}
	}

}
