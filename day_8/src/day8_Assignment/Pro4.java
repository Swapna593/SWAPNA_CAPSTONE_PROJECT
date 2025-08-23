package day8_Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*8. Convert LinkedList to ArrayList
Write a program to:
Create a LinkedList of Strings.
Convert it into an ArrayList.
Display both the LinkedList and ArrayList.*/
public class Pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> citys=new LinkedList<String>(List.of("kdp","kmp","ap"));
		ArrayList<String> citys2=new ArrayList<String>(citys);
		System.out.println(citys);
		System.out.println(citys2);
		
		Object c=citys.clone();
		System.out.println(c);

	}

}
