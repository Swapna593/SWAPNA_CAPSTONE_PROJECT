package collections_1;
import java.util.TreeSet;
public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		set.add("mango");
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("kiwi");
		set.add("kiwi");
		System.out.println(set);
		System.out.println(set.getFirst());
		System.out.println(set.getLast());
		System.out.println(set.clone());
		System.out.println(set.contains("mango"));
		System.out.println(set.ceiling("banana"));//next
		System.out.println(set.floor("kiwi"));//previous
		System.out.println(set.higher("banana"));
		System.out.println(set.lower("banana"));
		set.pollFirst();
		System.out.println(set);//removes first element from set
		set.pollLast();
		System.out.println(set);//removes last element from set
		

	}

}
