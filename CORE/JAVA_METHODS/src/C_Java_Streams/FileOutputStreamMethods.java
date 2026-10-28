package C_Java_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamMethods {
	
	/**
	 *             FileOutputStreamMethods
	 *             java.io.FileOutputStream
	 * 
	 */
public static void main(String[] args) throws Exception {
	// to write Binary data to the file.
	
	
	
	// Open file for reading
	FileInputStream fis = new FileInputStream("C:/Users/admin/JAVA_WORKSPACE/Files/Demo.txt");
	int x = fis.available();
	byte [] b = new byte[x];
	
	// read()
	fis.read(b);             // read file 

	// close()
	fis.close();
//======================================================================================================	
	
	// Open file for Writing 
	FileOutputStream fos = new FileOutputStream("C:/Users/admin/JAVA_WORKSPACE/Files/TextFile.txt");

	// write()
	fos.write(b);	     // write file
	System.out.println("Writing a file Successfull.");
	
	// close()
	fis.close();
	
	
	
	
	
	
	
	
}
}
