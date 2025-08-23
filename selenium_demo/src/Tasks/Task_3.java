package Tasks;
/*check if a student is eligible for a scholarship
* 1. a student must have score above 80 or must be from reserved category
*
* output=Scholarship granted or
* not eligible for the scholarship*/
 
public class Task_3 {

	public static void main(String[] args) {
        int score=70;
        boolean reser_cat=false;
        if(score>=80 || reser_cat==true) {
        	System.out.println("Eligible for scholarship!....");
        }
        else {
        	System.out.println("Not Eligible for scholarship!....");
        }
	}

}
