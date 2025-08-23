package day_6_Assignment;
/*Days of the Week
Define an enum DaysOfWeek with seven constants. Then in main(), prompt the user to input a day name and:
Print its position via ordinal().
Confirm if it's a weekend day using a switch or if-statement.*/
import java.util.Scanner;
public class Program4 {
enum DaysOfWeek{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any DaysOfWeek : ");
		String s=sc.nextLine();
		DaysOfWeek day=DaysOfWeek.valueOf(s);
		if(day==DaysOfWeek.SATURDAY||day==DaysOfWeek.SUNDAY) {
		    System.out.println("Weekend");
		}
		else {
			System.out.println("Weekday");
		}
		System.out.println("Position via ordinal : "+day.ordinal());//Like indexing the enum type

	}

}
