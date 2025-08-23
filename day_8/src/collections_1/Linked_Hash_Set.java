package collections_1;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Linked_Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("mango");
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("kiwi");
		System.out.println(set);
		System.out.println(set.getFirst());
		System.out.println(set.getLast());
		System.out.println(set.clone());
		System.out.println(set.contains("Hi"));
		set.remove("hello");
//		set.clear();
//		System.out.println(set.isEmpty());
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
