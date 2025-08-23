package collections_1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<String>();
		q.add("apple");
		q.add("mango");
		q.add("orange");
		q.add("kiwi");
		q.add("banana");
		q.add("banana");
		System.out.println(q);//it follows increasing order(Alphabetical order) like a,b,c.... while storing in priority queue.
		//Only for first two elements.
		System.out.println(q.element());//will return first element in queue
		q.poll();//removes apple
		System.out.println(q);
		q.poll();//removes banana
		System.out.println(q);
		q.poll();//removes banana
		System.out.println(q);
		q.remove("kiwi");
		System.out.println(q);
		q.offer("grape");
		System.out.println(q);//queue might or might not accept
		

	}

}
