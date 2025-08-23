package Tasks;
/*2. WAP for simple calculator
* like addition, subtraction , multiplication, division
*/
public class Task_11 {

	public static void main(String[] args) {
          String opp="add";
          int a=10;
          int b=5;
          switch(opp) {
          case "add":
        	  System.out.println(a+b);
        	  break;
          case "sub":
        	  System.out.println(a-b);
        	  break;
          case "mul":
        	  System.out.println(a*b);
        	  break;
          case "div":
        	  System.out.println(a/b);
        	  break;
          default:
        	  System.out.println("Enter any one of the operation among ");
          }
	}

}
