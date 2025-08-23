package day8_Assignment;

import java.util.ArrayList;

/*Update an Element
Write a program to:
Create an ArrayList of subjects.
Replace one of the subjects (e.g., “Math” to “Statistics”).
Print the list before and after the update.*/
public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> subjects=new ArrayList<String>();
		subjects.add("Maths");
		subjects.add("Physics");
		subjects.add("chemistry");
		System.out.println(subjects);
		subjects.set(0,"Mathematics");
		System.out.println(subjects);

	}

}
