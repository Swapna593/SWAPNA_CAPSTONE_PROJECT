package day8_Assignment;

import java.util.ArrayList;
import java.util.List;

/*Remove Specific Element
Write a program to:
Create an ArrayList of Strings.
Add 5 fruits.
Remove a specific fruit by name.
Display the updated list.*/
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>(List.of("apple","banana","orange","kiwi","mango"));
		for(String s:list) {
			if(s=="kiwi") {
				list.remove(s);
			}
		}
		System.out.println("Updated list: "+list);

	}

}
