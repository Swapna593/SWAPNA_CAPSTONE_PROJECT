package inheritance;
//Single inheritance
class Animal{
	void eat(String eats) {
		System.out.println("Eats "+eats);
	}
	void sound(String sd) {
		System.out.println("Sounds "+sd);
	}
}


class Dom_Animal extends Animal{
	void lives(String live) {
		System.out.println("Lives in the "+live);
	}
}


public class MainClass2 {

	public static void main(String[] args) {
        Dom_Animal d=new Dom_Animal();
        System.out.println("----------Dog------------------");
        d.eat("Chicken");
        d.sound("barking");
        d.lives("home");
        System.out.println("-----------Cow----------------");
        d.eat("grass");
        d.sound("mooo");
        d.lives("hut");
        
        
	}

}
