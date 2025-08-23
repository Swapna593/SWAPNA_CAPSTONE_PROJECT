package conditional_stmts_pkg;

public class Switch_prac {

	public static void main(String[] args) {
         int val=3;
         switch(val) {
         case 1:
        	 System.out.println("Tea");
        	 break;
         case 2:
        	 System.out.println("Coffee");
        	 break;
         case 3:
        	 System.out.println("Juice");
        	 break;
         default:
        	 System.out.println("Invalid input! Enter valid input for tea,coffee or juice");
         }
	}

}
