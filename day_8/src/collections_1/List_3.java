package collections_1;

import java.util.*;
//create an Arraylist and search for an element
public class List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(List.of(40,20,40,30,10));
		int find=30;
		Iterator<Integer> itr=list.listIterator();
		while(itr.hasNext()) {
			if(itr.next()==find) {
				System.out.println("element "+find+" found at "+list.indexOf(find));
			}
		}

	}

}
