package comparator_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id,String name){
    	this.id=id;
    	this.name=name;
    }
	@Override
	public int compareTo(Student s) {
		return id - s.id;
	}
	public String toString() {
		return id+" "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>  list=Arrays.asList(
				new Student(4,"A"),
				new Student(2,"B"),
				new Student(3,"C")
				);
		Collections.sort(list);//uses comparable--ascending
//		list.forEach(System.out::println);
		for(Student s:list) {
			System.out.println(s);
		}
		
		

	}
	
}
