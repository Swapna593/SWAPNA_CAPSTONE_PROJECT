package inheritance;
class Prathap{
	void surname() {
		System.out.println("Surname is Ankireddy");
	}
	void per_address() {
		System.out.println("Permanent address is Kadapa");
	}
}

class Swapna extends Prathap{
	void job() {
		System.out.println("Project Engineer");
	}
	void education() {
		System.out.println("Bachelor's in CSE ");
	}
	
}

public class MainClass1 {
	public static void main(String[] args) {
		Swapna s=new Swapna();
		s.surname();
		s.per_address();
		s.job();
        s.education();
        System.out.println("----------------------------");
        Prathap p=new Prathap();
        p.surname();
        p.per_address();
	}

}
