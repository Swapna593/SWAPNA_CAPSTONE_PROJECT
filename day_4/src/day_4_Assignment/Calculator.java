package day_4_Assignment;

public class Calculator {
	 static void add(int a,int b) {
		System.out.println(a+b);
	}
	 static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	 static void add(double a,double b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Calculator.add(2, 3);
		Calculator.add(2, 3,8);
		Calculator.add(2.5, 3.0);
	}

}
