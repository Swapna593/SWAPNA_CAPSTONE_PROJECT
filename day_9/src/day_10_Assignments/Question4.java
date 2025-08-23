package day_10_Assignments;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question4 {
/*Write a program to append a line of text to an existing file.*/
	public static void main(String[] args) throws IOException {
		
        BufferedWriter bw=new BufferedWriter(new FileWriter("employee.txt",true));
        bw.write("Welcome to day 10 assignment answers");
        System.out.println("Done");
        bw.close();
        
        
	}

}
