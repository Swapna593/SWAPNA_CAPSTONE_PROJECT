package day8_Assignment;
/* Add Elements at First and Last Position
Write a program to:
Create a LinkedList of integers.
Add elements at the beginning and at the end.
Display the updated list.*/
import java.util.LinkedList;
import java.util.List;
public class Pro1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>(List.of(1,2,3,4,5));
		System.out.println(list);
		list.add(0,20);
		list.add(list.size(),30);
		System.out.println(list);
		

	}

}
