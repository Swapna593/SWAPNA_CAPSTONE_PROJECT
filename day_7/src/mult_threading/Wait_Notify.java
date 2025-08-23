package mult_threading;
class Simple{
	void waitforsignals() throws InterruptedException{
	synchronized (this) {
		System.out.println("Waiting");
		wait();
		System.out.println("Resume");
	}	
	}
	void givessignal() {
		synchronized (this) {
			notify();
		}
	}
}

public class Wait_Notify {

	public static void main(String[] args) {
		Simple s=new Simple();
		Thread t1=new Thread(()->{
			try {
				s.waitforsignals();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		});
		Thread t2=new Thread(()->{
			try {
				Thread.sleep(5000);
				s.givessignal();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		});
	}

}
