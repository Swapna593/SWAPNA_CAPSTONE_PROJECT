package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lines=new ArrayList<String>();
		BufferedReader br=null;
		try {
		    br=new BufferedReader(new FileReader("D:/File_hand/Sample.txt"));
		    String line;
		    while((line=br.readLine())!=null) {
		    	lines.add(line);
		    }
		    for(String s:lines) {
		    	System.out.println(s);
		    }
		}catch(IOException e) {
			System.out.println(e);
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
