package file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
///Write a program to write data into a file using Files.write() and append
//using StandardOpenOption.APPEND.

public class Copy_File_Path {

	public static void main(String[] args) throws IOException {

		Path path=Paths.get("Demo1.txt");
		
        //create file
		Files.createFile(path);
		System.out.println(path.getFileName());
		System.out.println("File created");
		
		//copy file
		Path copypath=Paths.get("Democopy1.txt");
		Files.copy(path, copypath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Copied path");
		
		//move file
		Path movedPath=Paths.get("movedfile1.txt");
		Files.copy(copypath, movedPath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File moved");
		
		//Delete file
	    Files.deleteIfExists(path);
		Files.delete(movedPath);
		System.out.println("Files deleted");
		
		
	}

}
