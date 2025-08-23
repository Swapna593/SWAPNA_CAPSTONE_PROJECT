package day8_Assignment;

import java.util.ArrayList;
import java.util.List;

/*Sort Elements
Write a program to:
Create an ArrayList of integers.
Add at least 7 random numbers.
Sort the list in ascending order.
Display the sorted list.*/
public class Que3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(List.of(1,3,12,45,67,89,71));
	    for(int i=0;i<list.size()-1;i++) {
	    	int n1=list.get(i);
	    	int n2=list.get(i+1);
	    	if(n1>n2) {
	    		n1=n1+n2;
	    		n2=n1-n2;
	    		n1=n1-n2;
	    	}
	    }
	    System.out.println(list);
	}

}
