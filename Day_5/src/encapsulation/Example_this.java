package encapsulation;

public class Example_this {
	String name;
    int id;
    Example_this(String name,int id){
    	this.name=name;//1
    	this.id=id;
    	System.out.println("Parameterised constructor");
    }
    Example_this(){
    	this("Jyoshna",502);//3.calling constructor inside another constructor
    	
    }
    void details() {
    	System.out.println("Name : "+name);
    	System.out.println("ID : "+id);
    	details(this);//2
    }
    void show() {
    	this.details();//4
    }
    
    void details(Example_this e) {
    	System.out.println("This method parameter is of Example_this class type");
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_this e1=new Example_this("Swapna",501);
		e1.details();
		e1.show();
		Example_this e2=new Example_this();
		
		

	}

}
