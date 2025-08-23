package day_10_Assignments;

import java.io.File;
import java.io.FilenameFilter;

public class Display_text_Files {

	public static void main(String[] args) {
		File folder=new File("D:\\File_hand");
		
		FilenameFilter filter=new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".txt");
			}
			
		};
		
		String[] arr=folder.list(filter);
		if(arr!=null && arr.length>0) {
			for(String s:arr) {
				System.out.println(s);
			}
		}
		
		

	}

}
