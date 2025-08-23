package day9_Assignment;

import java.util.ArrayList;
import java.util.Collections;

/*Create an Employee class and sort by name using Comparable.
Use the compareTo() method to sort alphabetically by employee names.*/
public class Employee implements Comparable<Employee>{
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	public String toString() {
		return "Name: "+name+" id: "+id;
	}

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("c",2));
		list.add(new Employee("a",3));
		list.add(new Employee("b",1));
		
		Collections.sort(list);
		
		for(Employee e:list) {
			System.out.println(e);
		}
		

	}

}
