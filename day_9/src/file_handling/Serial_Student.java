package file_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial_Student {

	public static void main(String[] args) throws IOException {
		Student s1=new Student(1,"Swapna");
		FileOutputStream fos=new FileOutputStream("D:/File_hand/Student.doc");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("Serialization done");
		oos.close();
		fos.close();
		
		
		

	}

}
