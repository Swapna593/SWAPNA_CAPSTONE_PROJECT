package day_7_Assignment;
/*Create a class Box with a variable length. Write a method that modifies the value of length by passing the Box object. 
 * \Show that the original object is modified.*/
public class Que5 {
    int length;
    public void modify(Que5 q) {
    	q.length=40;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que5 q=new Que5();
        q.length=80;
        q.modify(q);
        System.out.println(q.length);
	}

}
