package day9_Assignment;

import java.util.ArrayList;
import java.util.Collections;

/*Create a Product class and sort products by price using Comparable.
Implement Comparable<Product> and sort a list of products using Collections.sort().*/
public class Product implements Comparable<Product>{
	String p_name;
	int price;
	Product(String p_name,int price){
		this.p_name=p_name;
		this.price=price;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.price, o.price);
	}
	public String toString() {
		return "Price : "+price+"  Product : "+p_name;
	}

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("C",25));
		list.add(new Product("A",2));
		list.add(new Product("B",27));
		
		Collections.sort(list);
		
		for(Product p:list) {
			System.out.println(p);
		}
		

	}

	

}
