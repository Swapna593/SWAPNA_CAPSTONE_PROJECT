package interfaces;
interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Square implements Shape{
    public void draw() {
		System.out.println("Drawing square");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Circle();
		s.draw();
		s=new Square();
		s.draw();

	}

}
