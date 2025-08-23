package constructors;

public class Employee {
	int eid;
	String name;
	double sal;
	Employee(){
		System.out.println("Constructor with no parameters");
	}
	Employee(int eid,String name){
		System.out.println("Eid : "+eid);
		System.out.println("Name : "+name);
	}
	Employee(int eid,String name,double sal){
		System.out.println("Eid : "+eid);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		System.out.println("----------------------------------");
		Employee e2=new Employee(501,"Swapna");
		System.out.println("----------------------------------");
		Employee e3=new Employee(502,"Spandana",80000);

	}

}
