package day_7_Assignment;
class Test extends Thread{
	volatile boolean flag=true;
	public void stopping() {
		flag=false;
	}
	public void run() {
		while(flag==true) {
			System.out.println("thread started");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		System.out.println("Thread stopped execution");
		
	}
}
public class Thread_stop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.start();
		Thread.sleep(5000);
		t.stopping();

	}

}
