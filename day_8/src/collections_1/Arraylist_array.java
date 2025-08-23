package collections_1;
import java.util.*;
public class Arraylist_array {
//converting arraylist to array
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(List.of(40,20,40,30,10));
		Integer[] arr=list.toArray(new Integer[0]);
		for(Integer i:arr) {
			System.out.println(i);
		}
		

	}

}
