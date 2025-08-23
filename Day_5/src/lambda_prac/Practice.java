package lambda_prac;
import java.util.function.Predicate;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEven=num->num%2==0;
		System.out.println(isEven.test(7));

	}

}
