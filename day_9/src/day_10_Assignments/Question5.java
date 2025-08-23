package day_10_Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*Write a program to count the number of lines, words, and characters in a file.*/
public class Question5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("employee.txt"));
		List<String> list=new ArrayList();
		int line=0;
		while(br.readLine() != null) {
			list.add(br.readLine());
			line++;
		}
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("line count: "+line);
		
		br.close();

	}

}
