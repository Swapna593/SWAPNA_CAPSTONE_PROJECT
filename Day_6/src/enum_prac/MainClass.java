package enum_prac;

interface Students{
	void display();
}

enum Student implements Students{
	Student1{
		public void display() {
			System.out.println("Displaying Student1 details");
		}
	}

} 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=Student.Student1;
		s.display();
		
	}

}
