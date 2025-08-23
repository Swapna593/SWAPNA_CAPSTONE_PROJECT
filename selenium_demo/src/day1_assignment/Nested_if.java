package day1_assignment;
//Write a Java program using nested if statements.
public class Nested_if {
	public static void main(String[] args) {
		int n=5;
		if(n>0) {
			if(n%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		else {
			System.out.println("negative or zero");
		}

	}

}
