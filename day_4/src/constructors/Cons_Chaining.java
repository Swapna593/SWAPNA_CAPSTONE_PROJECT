package constructors;
class School{
	School(){
		System.out.println("Uniform is Mandatory");
		System.out.println("Attendence 80% or above is must");
	}
}
class ABPS extends School{
	ABPS(){
		super();//Explicit super calling stmt
		System.out.println("Aditya Birla Public School");
	}
	
}

public class Cons_Chaining {

	public static void main(String[] args) {
        ABPS a=new ABPS();
	}

}
