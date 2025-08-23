package day_5_Assignments;
/*Student with Grade Validation & Configuration 
Ensure marks are always valid and immutable once set. 
Create a Student class with private fields: name, rollNumber, and marks. 
Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0. 
Provide getter methods, but no setter for marks (immutable after object creation). 
Add displayDetails() to print all fields. 
In future versions, you might allow updating marks only via a special inputMarks(int newMarks)
 method that has stricter logic (e.g. cannot reduce marks). Design accordingly.*/ 

class Student{
	private String name;
	private int roll;
	private double marks;
	Student(String name,int roll,double marks){
		this.name=name;
		this.roll=roll;
		if(marks>=0 && marks<=100) {
		   this.marks=marks;
		}
		else {
			this.marks=0;
		}
	}
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public double getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	void display_details() {
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Marks : "+marks);
	}
	void update_marks(double newMarks) {
		if(this.marks<newMarks) {
			System.out.println("Updated marks upon verification");
			this.marks=newMarks;
		}
		else {
			System.err.println("Not possible to update marks as newmarks are less than previous marks");
		}
	}
	
}
public class Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Swapna",501,98.5);
	    s.display_details();
	    s.setName("Swapna");
	    s.setRoll(501);//we cant set marks
	    s.update_marks(99);
	}

}
