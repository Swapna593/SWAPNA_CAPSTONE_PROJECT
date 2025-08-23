package collections_1;
import java.util.*;
public class List_Demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1,"Banana");
		list.add(2,"Kiwi");
		list.add(3,"Orange");
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.set(2, "Mango");//set will replace
		System.out.println(list);
		list.add(3,"Jackfruit");//add will just add
		System.out.println(list);
		
		System.out.println(list.indexOf("Mango"));
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana"));
		
		list.remove(0);
		list.remove("Jackfruit");
		System.out.println(list);
		

	}

}
