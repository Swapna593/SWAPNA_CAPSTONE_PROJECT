package day8_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Reverse the ArrayList
Write a program to:
Create an ArrayList of characters.
Add 5 characters.
Reverse the list using Collections.reverse() and display it.*/
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list=new ArrayList<Character>(List.of('a','c','v','b','e'));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		

	}

}
