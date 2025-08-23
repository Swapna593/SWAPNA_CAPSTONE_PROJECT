package collections_1;
import java.util.*;
public class Merge_Arraylist {
//Merge 2 ArrayList and remove duplicates
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		l2.add(4);
		l2.add(4);
		l2.add(6);
		System.out.println(l2);

		for(int i:l2) {
			if(!l1.contains(i)) {
				l1.add(i);
			}
		}
		System.out.println(l1);

	}

}
