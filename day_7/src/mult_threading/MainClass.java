package mult_threading;
class Test extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("Current Thread "+ Thread.currentThread());
		System.out.println("Current name :"+Thread.currentThread().getName());
		Thread.currentThread().setName("Avengers");
		System.out.println("New name :"+Thread.currentThread().getName());
		System.out.println("Current Priority :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		System.out.println("New Priority :"+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
	}
}//yeild method is used to hold current thread execution
class Test2 extends Thread{
    public void run() {
    	for(char i='a';i<='e';i++) {
			System.out.println(i);
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test2 t1=new Test2();
		t.start();
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println("program ends");
	}

}
/*package Muti_Threading;
//We can create Multi threading using
//1. By extending Thread class
//2. By implementing Runnable Interface
class Test1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Welcome");
		}
		System.out.println("Print id for thread="+Thread.currentThread().getId());
		System.out.println("current name="+Thread.currentThread().getName());
		Thread.currentThread().setName("Print_welcome_message");
		System.out.println("New name is="+Thread.currentThread().getName());
		System.out.println("Priority test1 is="+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		System.out.println("New Priority for test1 is="+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		
	}
}
 
public class Test extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Hello ");
		
		}
//		System.out.println("Print id for thread="+Thread.currentThread().getId());
//		System.out.println("current name="+Thread.currentThread().getName());
//		Thread.currentThread().setName("Print_Hello_message");
//		System.out.println("New name is="+Thread.currentThread().getName());
		System.out.println("Priority test is="+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println("New Priority for test is="+Thread.currentThread().getPriority());
	}
	
 
	public static void main(String[] args) throws InterruptedException {
		Test t1=new Test();// creating thread
		Test1 t2=new Test1();//System.out.println(Thread.currentThread().getName());
		
		t1.start();
		
		t2.join();
		
		t2.start();
		t1.join();
      System.out.println(t1.isAlive());
 
	}
 
}
 */
