package collections_1;

import java.util.ArrayDeque;

public class Array_Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.add("apple");
		q.add("mango");
		q.add("orange");
		q.add("kiwi");
		q.add("banana");
		q.add("banana");
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		q.offerFirst("F1");
		q.offerLast("F2");
		q.offer("Fruit");
		System.out.println(q);
		System.out.println(q.peek());
		

	}

}
