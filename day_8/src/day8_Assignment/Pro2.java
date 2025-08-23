package day8_Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*Search for an Element
Write a program to:
Create a LinkedList of Strings.
Ask the user for a string to search.
Display if the string is found or not.*/
public class Pro2 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(List.of("Hi","Hello","bye"));
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("bye")) {
				System.out.println("found ");
			}
		}

	}

}
