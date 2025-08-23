package interfaces;
interface Parent1{
	void flat();
	void car();
}
interface Parent2{
	void flat();
	void bike();
}
class Child implements Parent1,Parent2{
	public void flat() {
		System.out.println("2BHK Flat");
	}
	public void car() {
		System.out.println("Sports car");
	}
	public void bike() {
		System.out.println("Sports bike");
	}
}
public class Family {

	public static void main(String[] args) {
		Child c=new Child();
		c.flat();
		c.bike();
		c.car();

	}

}
