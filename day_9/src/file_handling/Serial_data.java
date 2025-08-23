package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Serial_data {

	public static void main(String[] args) {
		Employee emp=new Employee(501,"Swapna");
		try {
			FileWriter fw=new FileWriter("D:/File_hand/Sample.txt");
			BufferedWriter bw=new BufferedWriter(fw);
            bw.write(emp.toString());
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Done");
		}catch(Exception e) {
			System.out.println("Failed");
			System.out.println(e);
		}

	}

}
