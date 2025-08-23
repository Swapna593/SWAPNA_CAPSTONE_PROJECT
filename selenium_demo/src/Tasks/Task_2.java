package Tasks;
/*print weekdays if it is mon, tue, wed, thu, fri
* else print weekend*/
public class Task_2 {

	public static void main(String[] args) {
       String day="Mon";
       if(day=="Mon"||day=="Tue"||day=="Wed"||day=="Thurs"||day=="Fri") {
    	   System.out.println(day+" is Weekday");
       }
       else {
    	   System.out.println(day+" is Weekend");
       }
	}

}
