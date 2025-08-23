package collections_1;
import java.util.*;
public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> l1=new LinkedList<>(List.of('a','b','c'));
		System.out.println("All methods of arraylist are available in linkedlist");
		System.out.println(l1);
		Iterator<Character> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------");
		for(char c:l1) {
			System.out.println(c);
		}
		

	}

}
