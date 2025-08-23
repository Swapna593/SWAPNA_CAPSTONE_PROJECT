package pkg_1;

public class DataType {
	int id=1;
    String name="Swapna";
    long contact=9010234566l;
    String course="Java Selenium";
    float marks=95.9f;

	public static void main(String[] args) {
       DataType d=new DataType();
       System.out.println("Id: "+d.id);
       System.out.println("Name: "+d.name);
       System.out.println("contact: "+d.contact);
       System.out.println("couse: "+d.course);
       System.out.println("marks: "+d.marks);
	}

}
