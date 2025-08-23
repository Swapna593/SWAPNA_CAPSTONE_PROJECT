package day_6_Assignment;

import java.util.Scanner;

/* Compass Directions
Create an enum Direction with the values NORTH, SOUTH, EAST, WEST. Write code to:
Read a Direction from a string using valueOf().
Use switch or if to print movement (e.g. “Move north”).
Test invalid inputs with proper error handling.*/
public class Program5 {
enum Direction{NORTH, SOUTH, EAST, WEST}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Direction : ");
		try {
		   String direction=sc.nextLine();
		   Direction d=Direction.valueOf(direction);
		   switch(d) {
		   case NORTH:
			  System.out.println("Move NORTH");
			  break;
		   case SOUTH:
			  System.out.println("Move SOUTH");
			  break;
		   case EAST:
			  System.out.println("Move EAST");
			  break;
		   case WEST:
			  System.out.println("Move WEST");
			  break;
		   }
			
		}catch(Exception e) {//IllegalArgumentExcetion
			System.out.println(e);
		}

	}

}
