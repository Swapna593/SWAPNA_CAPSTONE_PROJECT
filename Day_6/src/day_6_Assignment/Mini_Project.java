package day_6_Assignment;
/*MiniProject – Temperature Converter 
1.Prompt user for a temperature in Celsius (double).
2.Convert it to Fahrenheit:
double fahrenheit = celsius * 9/5 + 32;
3.Then cast that fahrenheit to int for display.
4.Print both the precise (double) and truncated (int) values, and comment on precision loss.*/
import java.util.Scanner;
public class Mini_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Temperature Converter!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in celsius : ");
		double cel=sc.nextDouble();
		double fahrenheit = cel * 9/5 + 32;
		int temp=(int)fahrenheit;
		System.out.println("Temp in double : "+fahrenheit);
		System.out.println("Temp in int : "+temp);
		
		

	}

}
