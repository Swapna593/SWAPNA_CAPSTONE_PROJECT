package collections_1;

import java.util.*;

public class Linkedlist_clone{

	public static void main(String[] args){
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		Object l2=new LinkedList<>();
        l2=l1.clone();
        System.out.println(l1);
        System.out.println(l2);
        
		

	}

}
