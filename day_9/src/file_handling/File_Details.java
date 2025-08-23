package file_handling;

import java.io.File;

public class File_Details {

	public static void main(String[] args) {
		File f=new File("D:/File_hand/Sample.txt");
		if(f.exists()) {
			System.out.println("Name "+f.getName());
			System.out.println("Path: "+f.getAbsolutePath());
			System.out.println(f.getPath());
			System.out.println("Length: "+f.length());
			System.out.println("Readable: "+f.canRead());
			System.out.println("Writable: "+f.canWrite());
		}
		else {
			System.out.println("file doesn't exist");
		}

	}

}
