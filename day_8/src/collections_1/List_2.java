package collections_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(List.of(40,20,40,30,10));
		Collections.sort(list);
		System.out.println(list);

	}

}
