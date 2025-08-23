package collections_1;

import java.util.*;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1,"Banana");
		list.add(2,"Kiwi");
		list.add(3,"Orange");
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();//iterator
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");
		Iterator<String> itr2=list.listIterator();//listIterator
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		

	}

}
