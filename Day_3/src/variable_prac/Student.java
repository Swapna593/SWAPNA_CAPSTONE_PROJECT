package variable_prac;

public class Student {
	int roll;
	int age;
	String name;//member/instance variable
	double per;
	static String college="JSP";//static common variable
	
	void display_details(int roll,int age,String name,double per) {
		System.out.println(roll+"\t"+age+"\t"+name+"\t"+per+"\t"+college);
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(per);
//		System.out.println(college);
	}

	public static void main(String[] args) {
         Student st=new Student();
         System.out.println("Roll"+"\t"+"Age"+"\t"+"Name "+"\t"+"Percentage "+"\t"+"College");
         System.out.println("--------------------------------------------------------");
         st.display_details(101, 20, "Swapna", 77);
         System.out.println("--------------------------------------------------------");
         st.display_details(102, 21, "Jyoshna", 87.7);
         System.out.println("--------------------------------------------------------");
         st.display_details(103, 22, "Spandana", 97);
         System.out.println("--------------------------------------------------------");
         st.display_details(104, 23, "Snoopy", 98);
         System.out.println("--------------------------------------------------------");
         st.display_details(105, 24, "Jyothi", 98.7);
         System.out.println("--------------------------------------------------------");
         st.display_details(106, 25, "Prathap", 99.7);
         
	}

}
