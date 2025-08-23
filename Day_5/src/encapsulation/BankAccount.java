package encapsulation;

public class BankAccount {
	private double balance;
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("Deposited : "+amt);
		}
	}
	private void withdraw(double amt) {
		if(amt<=balance) {
			balance-=amt;
			System.out.println("Withdrawn "+amt);
		}
		else {
			System.err.println("Insufficient balance");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		System.out.println("Balance : "+b.getBalance());
		b.deposit(10000);
		System.out.println("Balance : "+b.getBalance());
		b.withdraw(5000);
		System.out.println("Balance : "+b.getBalance());
		
	}

}
