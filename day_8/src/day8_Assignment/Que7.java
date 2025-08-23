package day8_Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a program to:
Create an ArrayList with some elements.
Create a second ArrayList.
Copy all elements from the first to the second using addAll() method.*/
public class Que7 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>(List.of(1,2,3,4,5));
		ArrayList<Integer> l2=new ArrayList<Integer>();

		l2.addAll(l1);
		System.out.println(l2);
	}

}
