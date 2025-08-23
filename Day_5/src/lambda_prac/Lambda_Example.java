package lambda_prac;
interface Even{
	boolean isEven(int n);
}
public class Lambda_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even check=(num)->num%2==0;
		System.out.println(check.isEven(0));

	}

}//lambda expression work only on functional interface
//l.e can be passed as arguments to functional interface
//limitation:interface should have single method
//we can't overload l.e methods
//Are lambda compile into classes?a)yes as it accepts input of object type
