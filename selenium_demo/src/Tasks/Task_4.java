package Tasks;
/*write a program to check temperature and display message like
* 40c --> "Very hot
* 30-40c-->HOt
* 20-29c-->warm
* 10-19c-->Cool
* <10c-->very cool
 */
public class Task_4 {

	public static void main(String[] args) {
          float temp=40f;
          if(temp>=40) {
        	  System.out.print("Very Hot");
          }
          else if(temp>=30 && temp<40) {
        	  System.out.print("Hot");
          }
          else if(temp>=20 && temp<=29) {
        	  System.out.print("Warm");
          }
          else if(temp>=10 && temp<=19) {
        	  System.out.print("Cool");
          }
          else {
        	  System.out.print("Very cool");
          }
	}

}
