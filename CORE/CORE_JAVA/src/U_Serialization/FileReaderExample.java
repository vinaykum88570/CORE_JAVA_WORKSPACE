package U_Serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) {
		
		// File Reader Example
		
	  try {
		File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Demo.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			String nextLine = scan.nextLine();
			System.out.println(nextLine);
		}
	  } 
	   catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}
}
