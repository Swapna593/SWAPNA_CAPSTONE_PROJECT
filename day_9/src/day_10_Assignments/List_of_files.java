package day_10_Assignments;

import java.io.File;

public class List_of_files {

	public static void main(String[] args) {
		File ref=new File("D:\\File_hand");
		String[] arr=ref.list();
		for(String s:arr) {
			File obj=new File(ref,s);
			boolean flag=obj.isFile();
			if(flag==true) {
				System.out.println(s);
			}
		}
	}

}
