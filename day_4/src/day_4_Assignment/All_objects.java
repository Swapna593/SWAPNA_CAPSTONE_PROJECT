package day_4_Assignment;
//Write code to store all objects in an array and use polymorphism to invoke their performFunction(). 
class Student{
	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	void performFunction() {
		System.out.println(name+" with id: "+id+" started studying");
	}
}
public class All_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Swapna",501);
		Student s2=new Student("Jyoshna",502);
		Student s3=new Student("Spandana",503);
		Student arr[]= {s1,s2,s3};
		for(Student s:arr) {
			s.performFunction();
		}
		

	}

}
