package conditional_stmts_pkg;

public class Break_prac {

	public static void main(String[] args) {
         for(int i=1;i<=100;i++)
         {
        	 System.out.println(i);
        	 if(i==10)
        	 {
        		 break;
        	 }
         }
         
         for(int i=1;i<=10;i++)
         {
        	// System.out.println(i);
        	 if(i%2==0) {
        		 continue;
        	 }
        	 System.out.println(i);
         }
	}

}
