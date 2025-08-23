package enum_prac;

public class Day_Switch {
enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d=Day.Monday;
		switch(d) {
	    case Monday:
	    	System.out.println("Monday");
	    	break;
	    case Tuesday:
	    	System.out.println("Tuesday");
	    	break;
	    case Wednesday:
	    	System.out.println("Wednesday");
	    	break;
	    case Thursday:
	    	System.out.println("Thursday");
	    	break;
	    case Friday:
	    	System.out.println("Friday");
	    	break;
	    case Saturday:
	    	System.out.println("Saturday");
	    	break;
	    	
	}

	}

}
