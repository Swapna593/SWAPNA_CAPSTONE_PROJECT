package day_10_Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a program to read a file using Scanner and display the tokens.
public class Scanner_File {

	public static void main(String[] args) {
            try {
            	File file=new File("D://File_hand/Sample.txt");
				Scanner sc=new Scanner(file);
				
				while(sc.hasNext()) {
					String s=sc.next();
					System.out.println(s);
				}
				sc.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
            
	}

}
