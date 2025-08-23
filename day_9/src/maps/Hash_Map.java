package maps;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("one","orange");
		map.put("two","mango");
		map.put("three","apple");
		map.put("four","kiwi");
		map.put("five","banana");
		map.put(null,"fruit");
		map.put(null,null);
		System.out.println(map);//doesn't follow order of insertion
		System.out.println(map.get("two"));
		map.replace("four", "custordapple");
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

	}

}
