package day_4_Assignment;
/*Create a Bank class with a method getInterestRate() 
 * create subclasses: SBIà return 6.7%  
 *                   ICICIà return 7.0% 
 *                   HDFCà return 7.5% */
class Bank {
	void getInterestRate() {
		System.out.println("Interest rate is different for each bank ");
	}
}
class SBI extends Bank{
	void getInterestRate() {
		System.out.println("Interest rate at SBI : 6.7% ");
	}
}
class ICICI extends Bank{
	void getInterestRate() {
		System.out.println("Interest rate at ICICI : 7.0%");
	}
}
class HDFC extends Bank{
	void getInterestRate() {
		System.out.println("Interest rate at HDFC : 7.5%");
	}
}
public class MainClass5 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		SBI s=new SBI();
		ICICI i=new ICICI();
		HDFC h=new HDFC();

		b.getInterestRate();
		s.getInterestRate();
		i.getInterestRate();
		h.getInterestRate();

	}

}
