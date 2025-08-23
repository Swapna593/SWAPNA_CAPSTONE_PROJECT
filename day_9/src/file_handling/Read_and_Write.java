package file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_and_Write {

	public static void main(String[] args) {
		BufferedWriter bw=null;
		BufferedReader br=null;
		List<String> lines=new ArrayList<String>();
		try {
			bw=new BufferedWriter(new FileWriter("D:/File_hand/Sample.txt",true));
			br=new BufferedReader(new FileReader("D:/File_hand/Sample.txt"));
			bw.write("Third line ");
			bw.newLine();
			bw.write("Fourth line\n");
			System.out.println("Wrote into the file successfully");
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String line;
			while((line=br.readLine())!=null) {
				lines.add(line);
			}
			
			for(String s:lines) {
				System.out.println(s);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
