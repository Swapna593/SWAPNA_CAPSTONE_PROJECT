package file_handling;

import java.io.File;

public class Create_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:/File_hand/Sample.txt");
		try {
			f.createNewFile();
			System.out.println("created");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
