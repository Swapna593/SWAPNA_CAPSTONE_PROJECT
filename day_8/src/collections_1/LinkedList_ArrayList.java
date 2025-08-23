package collections_1;
import java.util.*;
public class LinkedList_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>(List.of(1,2,3));
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>(l1);
		System.out.println(l2);

	}

}
