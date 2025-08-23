package day_5_Assignments;

public class LambdaEven {
    public static void main(String[] args) {
        CheckEvenOdd check = (num) -> num % 2 == 0;
        int number = 7;
        System.out.println(number + " is " + (check.isEven(number) ? "even" : "odd"));
    }
    @FunctionalInterface
    interface CheckEvenOdd {
        boolean isEven(int num);
    }
}
