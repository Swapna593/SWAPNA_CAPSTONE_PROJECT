package conditional_stmts_pkg;

public class if_elif_lad {

	public static void main(String[] args) {
         float per=500f;
         if(per>=75 && per<=100) {
        	 System.out.println("Dist");
         }
         else if(per<75 && per>=60){
        	 System.out.println("First class");
         }
         else if(per>=50 && per<60) {
        	 System.out.println("Second class");
         }
         else if(per>=35 && per<50)
         {
        	 System.out.println("Pass");
         }
         else if(per<35 && per>=0) {
        	 System.out.println("Fail");
         }
         else {
        	 System.out.println("Invalid input");
         }
	}

}
