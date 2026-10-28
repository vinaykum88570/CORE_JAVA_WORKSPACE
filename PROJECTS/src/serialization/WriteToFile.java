package serialization;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	
	public static void main(String[] args) {
		try {
			FileWriter filewriter = new FileWriter("C:/Users/admin/OneDrive/Desktop/Demo/CreateFile.txt");
			filewriter.write("Hello My name is Vinay");
			filewriter.close();
			System.out.println("file write successfully");
		} catch (IOException e) {
			System.err.println("An error occurred...........!");
			e.printStackTrace();
		}
	}

	
	

	}

