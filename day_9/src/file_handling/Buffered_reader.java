package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_reader {

	public static void main(String[] args) {
		BufferedReader b=null;
		try {
			b=new BufferedReader(new FileReader("D:/File_hand/Sample.txt"));
			String line;
			if((line=b.readLine())!=null) {
				System.out.println(line);
			}
			else {
				System.out.println("no data available to read");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
