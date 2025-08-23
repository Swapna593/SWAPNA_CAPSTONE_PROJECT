package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial_data {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("D:/File_hand/Student.doc");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student st1=(Student)ois.readObject();
		st1.display();
		System.out.println("Deserialization done");
		ois.close();
		fis.close();

	}

}
