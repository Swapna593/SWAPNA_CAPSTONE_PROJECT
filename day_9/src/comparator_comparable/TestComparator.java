package comparator_comparable;

import java.util.ArrayList;
import java.util.List;

class Student2{
	int id;
	String name;
	Student2(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
}
public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> list=new ArrayList();
		list.add(new Student2(10,"B"));
		list.add(new Student2(8,"F"));
		list.add(new Student2(9,"A"));
		
		list.sort((s1,s2)->s1.name.compareTo(s2.name));//for string comparision CompareTo is used
		
		for(Student2 s:list) {
			System.out.println(s);
		}
	}

}
