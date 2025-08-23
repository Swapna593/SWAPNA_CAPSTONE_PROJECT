package day8_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

/* Store Custom Objects
Write a program to:
Create a class Student with fields: id, name, and marks.
Create an ArrayList of Student objects.
Add at least 3 students.
Display the details using a loop.*/
public class Student {
	int id;
	String name;
	double marks;
	Student(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
		ArrayList<Student> stu=new ArrayList<Student>();
		Student s1=new Student(1,"Spandana",90.0);
		Student s2=new Student(1,"Swapna",85.0);
		Student s3=new Student(3,"Jyoshnana",91.0);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		
		Iterator<Student> itr=stu.iterator();
		while(itr.hasNext()) {
			Student detail=itr.next();
			System.out.println(detail.id+" "+detail.name+" "+detail.marks);
		}
		
		

	}

}
