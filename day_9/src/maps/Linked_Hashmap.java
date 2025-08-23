package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("one","orange");
		map.put("three","apple");
		map.put("five","banana");
		map.put("two","mango");
		map.put("four","kiwi");
		map.put(null,"fruit");
		map.put(null,null);
		System.out.println(map);//follows order of insertion
		System.out.println(map.get("two"));
		map.replace("four", "custordapple");
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

	}

}
