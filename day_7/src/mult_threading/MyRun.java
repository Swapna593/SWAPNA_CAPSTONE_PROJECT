package mult_threading;
class Runnable_Class implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class MyRun {

	public static void main(String[] args) {
		Runnable_Class rc=new Runnable_Class();
		Thread t1=new Thread(rc);
		Thread t2=new Thread(rc);
		t1.start();
		t2.start();

	}//Constructor for Thread
	//Thread()
    //Thread(Runnable child object)
	//Thread(Runnable child object)
	//Thread(Runnable child object)
	
}
