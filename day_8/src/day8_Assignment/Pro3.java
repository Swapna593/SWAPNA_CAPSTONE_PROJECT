package day8_Assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*Write a program to:
Create a LinkedList of cities.
Use ListIterator to display the list in both forward and reverse directions.*/
public class Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> citys=new LinkedList<String>(List.of("kdp","kmp","ap"));
		ListIterator<String> itr=citys.listIterator();
		System.out.println("Citys in forward direction");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("Citys in backward direction");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+"  ");
		}
		//System.out.println(citys.reversed());
		

	}

}
