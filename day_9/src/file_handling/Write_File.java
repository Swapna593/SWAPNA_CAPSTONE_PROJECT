package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {

	public static void main(String[] args) {
		try {
			BufferedWriter b=new BufferedWriter(new FileWriter("D:/File_hand/Sample.txt",true));
			b.write("Hello");
			b.newLine();
			b.write("Welcome to java programming");
			b.close();
			System.out.println("Wrote the data to file successfully");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
