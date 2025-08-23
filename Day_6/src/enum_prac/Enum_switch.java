package enum_prac;

public class Enum_switch {
enum Level{High,Medium,Low}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level l=Level.Medium;
		switch(l) {
		    case High:
		    	System.out.println("High level");
		    	break;
		    case Medium:
		    	System.out.println("Medium level");
		    	break;
		    case Low:
		    	System.out.println("Low level");
		    	break;
		}

	}

}
