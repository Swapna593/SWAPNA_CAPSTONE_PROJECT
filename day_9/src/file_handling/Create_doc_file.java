package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Create_doc_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:/File_hand/Example.doc");
		try {
			f.createNewFile();
			System.out.println("created");
		}catch(Exception e) {
			System.out.println(e);
		}
		List<String> lines=new ArrayList<String>();
		try {
			FileInputStream r=new FileInputStream(f);
			int line;
			while((line=r.read())!=-1) {
				System.out.println((char)line);
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
