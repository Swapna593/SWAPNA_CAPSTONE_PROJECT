package day_7_Assignment;
/*7.Create a program to show that Java is strictly "call by value" 
 * even when passing objects (object references are passed by value).*/
public class Pass_By_Value {
	 int length;
	    public void modify(Pass_By_Value q) {
	    	q.length=40;
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pass_By_Value q=new Pass_By_Value();
	        q.length=80;
	        q.modify(q);/*does't affect the original Reference ,
	        b/c only a copy of the reference is passed,& changes to that copy don't affect the original*/
	        System.out.println(q.length);
		}


}
