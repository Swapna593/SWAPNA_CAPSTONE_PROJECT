package interfaces;
interface Doctor{
	void operation();
	void opd();
}
interface Nurse{
	void daily_check();
	void documentation();
}
interface Accountant{
	void payment();
	void query();
}
class Patient implements Doctor,Nurse,Accountant{

	@Override
	public void payment() {
		System.out.println("Payment : 20000");
	}

	@Override
	public void query() {
		System.out.println("No queries");
		
	}

	@Override
	public void daily_check() {
		// TODO Auto-generated method stub
		System.out.println("daily_check completed");
		
	}

	@Override
	public void documentation() {
		// TODO Auto-generated method stub
		System.out.println("Documention of process is available ");
		
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("minor operation");
		
	}

	@Override
	public void opd() {
		// TODO Auto-generated method stub
		System.out.println("Out patient department");
		
	}
	
}
public class Hospital_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient();
		p.daily_check();
		p.documentation();
		p.operation();
		p.payment();
		p.query();
		p.opd();

	}

}
