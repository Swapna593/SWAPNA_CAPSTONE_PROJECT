package day9_Assignment;

import java.util.ArrayList;
import java.util.Collections;

/* Sort a list of students by roll number (ascending) using Comparable.
Create a Student class with fields: rollNo, name, and marks. 
Implement the Comparable interface to sort students by their roll numbers.*/
public class Student implements Comparable<Student>{
	int roll;
	String name;
	double marks;
	
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.roll, o.roll);
	}
	public String toString() {
		return "roll : "+roll+"  Name : "+name+"  Marks: "+marks;
	}
	public static void main(String[] args) {
		
	  ArrayList<Student> list=new ArrayList<Student>();
	  
      Student s1=new Student(11,"C",8.5);
      Student s2=new Student(1,"B",8.0);
      Student s3=new Student(8,"A",5.5);
      
      list.add(s1);
      list.add(s2);
      list.add(s3);
      
      Collections.sort(list);//internally uses overridden compareTo method 
      
      for(Student s:list) {
    	  System.out.println(s);
      }
	}
	

}
