package day_5_Assignments;
interface SumCalculator {
    int sum(int a, int b);
}
public class LambdaSum {

	public static void main(String[] args) {
		SumCalculator calculator = (a, b) -> a + b;

        int sum1 = calculator.sum(7, 6);
        System.out.println("Sum of 7 and 6: " + sum1);

        int sum2 = calculator.sum(15, -35);
        System.out.println("Sum of 15 and -35: " + sum2);
    }
}


