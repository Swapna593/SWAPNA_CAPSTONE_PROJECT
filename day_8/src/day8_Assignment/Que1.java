package day8_Assignment;
import java.util.ArrayList;
import java.util.Scanner;
/*Search an Element
Write a program to:
Create an ArrayList of integers.
Ask the user to enter a number.
Check if the number exists in the list.*/
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to check: ");
		int n=sc.nextInt();
		boolean exist=false;
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Integer i:list) {
			if(i==n) {
				exist=true;
				break;
			}
		}
		if(exist==true) {
			System.out.println("num exists");
		}
		else {
			System.out.println("num doesn't exists");
		}
		

	}

}
