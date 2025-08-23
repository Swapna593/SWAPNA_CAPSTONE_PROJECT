package file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path=Paths.get("D:/File_hand/Sample1.txt");
		//create file
//		Files.createFile(path);//it works for first time running of program then next shows exception as file already created in 1st run.
//		System.out.println("File created");
		//copy file
		Path copypath=Paths.get("D:/File_hand/Samplecopy.txt");
		Files.copy(path, copypath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copied");

	}

}
