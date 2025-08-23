package day3_assignment;

public class Employee {
	int id;
	String name;
	double sal;
	static String company="Wipro";
	
	void display_details(int id,String name,double sal) {
		System.out.println(id+"\t"+name+"\t"+sal+"\t"+company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		System.out.println("Id"+"\t"+"Name "+"\t"+"Salary "+"\t"+"Company");
        System.out.println("--------------------------------------------------------");
        emp.display_details(101,"Swapna", 50000.0);
        System.out.println("--------------------------------------------------------");
        emp.display_details(102,"Jyoshna", 80000.0);
        System.out.println("--------------------------------------------------------");
        emp.display_details(103,"Spandana", 90000.0);
		

	}

}
