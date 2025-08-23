package day_4_Assignment;
class Shape{
	void area() {
		System.out.println("Area of Shape");
	}
}
class Circle extends Shape{
	double pi=3.14;
	double radius=10;
	void area() {
		System.out.println("Area of  circle is : "+pi*radius*radius);
	}
	
}
class Rectangle extends Shape{
	int length=20;
	int width=10;
	void area() {
		System.out.println("Area of  Rectangle is : "+length*width);
	}
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area method of Shape class");
		Shape s=new Shape();
		s.area();
		System.out.println("Area method of Circle");
		Circle c=new Circle();
		c.area();
		System.out.println("Area method of Rectangle");
		Rectangle r=new Rectangle();
		r.area();

	}

}
