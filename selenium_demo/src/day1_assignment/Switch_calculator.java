package day1_assignment;
import java.util.Scanner;
public class Switch_calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1: ");
		int n1=sc.nextInt();
		System.out.println("enter n2: ");
		int n2=sc.nextInt();
		System.out.println("enter operation: ");
		String opp=sc.next();
		switch(opp) {
		case "add":
			System.out.println(n1+n2);
			break;
		case "sub":
			System.out.println(n1-n2);
			break;
		case "mul":
			System.out.println(n1*n2);
			break;
		case "div":
			System.out.println(n1/n2);
			break;
		case "mod":
			System.out.println(n1%n2);
			break;
		default:
			System.out.println("enter valid operation");
		}

	}

}
