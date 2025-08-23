package day_7_Assignment;
/*8.Write a program where you assign a new object to a reference passed into a method.
 *  Show that the original reference does not change.
 */
public class Pass_By_Value2 {
	int length;
    public void modify(Pass_By_Value q) {
    	q.length=40;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pass_By_Value q=new Pass_By_Value();
        q.length=80;
        q.modify(q);
        System.out.println(q.length);
        Pass_By_Value q1=new Pass_By_Value();
        System.out.println(q1.length);//the original reference does not change.

	}

}
