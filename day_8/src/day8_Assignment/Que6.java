package day8_Assignment;

import java.util.ArrayList;
import java.util.List;

/* Remove All Elements
Write a program to:
Create an ArrayList of integers.
Add multiple elements.
Remove all elements using clear() method.
Display the size of the list.*/
public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(List.of(1,2,3,4,5));
		System.out.println(list);
		list.clear();
		System.out.println(list.size());

	}

}
