package day_6_Assignment;
/*Compound Assignment Behaviour 
1.Initialize int x = 5;.
2.Write two operations:
x = x + 4.5;    // Does this compile? Why or why not?
x += 4.5;       // What happens here?
3.Print results and explain behavior in comments (implicit narrowing, compile error vs. successful assignment).*/
public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		//x=x+4.5;it show error because 4.5 of double type .
		System.out.println("Implicit narrowing  of x=4+4.5 as x+=4.5");
		x+=4.5;//compiles successfully as implicit += operator includes an implicit cast.Java automatically converts the result to int before assigning it to x.
		System.out.println("x : "+x);

	}

}
