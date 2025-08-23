package day_6_Assignment;
/*1.Write a program to:
oRead an int value from user input.
oAssign it to a double (implicit widening) and print both.
oRead a double, explicitly cast it to int, then to short, and print results—demonstrate truncation or overflow.*/
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		double d=n;//widening
		System.out.println("n : "+n);
		System.out.println("d : "+d);
		System.out.println("Enterd 2: ");
		double d2=sc.nextDouble();
		int n2=(int)d2;//narrowing
		System.out.println("d2 : "+d2);
		System.out.println("n2 : "+n2);

	}

}
