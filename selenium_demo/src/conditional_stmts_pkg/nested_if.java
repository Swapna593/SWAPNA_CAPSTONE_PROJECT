package conditional_stmts_pkg;

public class nested_if {

	public static void main(String[] args) {
          boolean isReg=false;
          boolean hasHallTicket=false;
          if(isReg) {
        	  if(hasHallTicket) {
        		  System.out.println("Student can write exam");
        	  }
        	  else {
        		  System.out.println("Student need hallticket to write exam");
        	  }
          }
          else {
        	  System.out.println("Student is not registered");
          }
	}

}
