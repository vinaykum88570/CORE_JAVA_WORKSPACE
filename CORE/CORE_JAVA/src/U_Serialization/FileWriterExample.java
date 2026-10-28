package U_Serialization;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
	// File Writer
		
		File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Demo.txt");
		
		try {
			
			FileWriter fw = new FileWriter(file);
	        fw.write("Hello Vinay");
	        fw.write("\nJava Developer");
	        fw.write("\nSpring Boot");

	        fw.close();

	        System.out.println("Data written successfully");
			}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
