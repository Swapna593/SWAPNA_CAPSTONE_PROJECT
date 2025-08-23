package collections_1;
import java.util.HashSet;
import java.util.Iterator;
public class Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s=new HashSet<String>();
		s.add("Hi");
		s.add("hello");
		s.add("World");
		s.add("Program");
		s.add(null);
		s.add(null);
//		System.out.println(s);//unordered
//		System.out.println(s.clone());
//		System.out.println(s.contains("Hi"));
//		s.remove("hello");
//		s.clear();
//		System.out.println(s.isEmpty());
//		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
