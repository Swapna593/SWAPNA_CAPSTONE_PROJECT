package mult_threading;
class Table{
	synchronized void print_table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class My_Run extends Thread{
	Table t;
	My_Run(Table t){
		this.t=t;
	}
	public void run() {
		t.print_table(1);
	}
}
public class Synchronized_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		My_Run r1=new My_Run(t);
		My_Run r2=new My_Run(t);
		r1.start();
		r2.start();
		
		
		
		

	}

}
