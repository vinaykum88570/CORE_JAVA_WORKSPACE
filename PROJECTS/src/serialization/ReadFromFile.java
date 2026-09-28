package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:/Users/admin/OneDrive/Desktop/Demo/CreateFile.txt");
			 Scanner scan = new Scanner(file);
			 while(scan.hasNextLine()) {
				 String nextLine = scan.nextLine();
				 System.out.println(nextLine);
			 }
			 
			 
		} catch (FileNotFoundException e) {
			System.out.println("An error Occurred :");
			e.printStackTrace();
		}
		
	}

}
