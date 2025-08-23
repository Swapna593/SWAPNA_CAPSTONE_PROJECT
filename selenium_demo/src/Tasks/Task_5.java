package Tasks;
/*write a program to calculate bill category based on units used
* units<100-->"Low usage"
* 100-299-->"Medium usage"
* 300-499-->"High usage"
* 500+-->"Very high usage"*/
public class Task_5 {

	public static void main(String[] args) {
          float units=100f;
          if(units<100) {
        	  System.out.println("Low Usage");
          }
          else if(units>=100 && units<=299) {
        	  System.out.println("Medium usage");
          }
          else if(units>=300 && units<=499) {
        	  System.out.println("High Usage");
          }
          else {
        	  System.out.println("Very High Usage");
          }
	}

}
