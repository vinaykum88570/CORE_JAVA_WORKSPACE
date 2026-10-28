package C_Java_Streams;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterClassMethods {
	/** 
	 *            PrintWriterClassMethods
	 *            java.io.PrintWriter       
	 */
/**
 * @param args
 */
public static void main(String[] args) throws Exception
{
// - it is the most enhanced Writer to write Character data to the file  
// - the main advantages of print writer over file writer buffer writer is
//   we can Write any type of primitive data directly to the file.
	 
	File file = new  File("C:/Users/admin/JAVA_WORKSPACE/Files/WriteFile.txt");
	FileWriter fw = new FileWriter(file);
	PrintWriter pr = new PrintWriter(fw);
	
	// write() - the curresponding character 'd' will be added to the file 
	pr.write(100);
	
	// print() - the curresponding int value 100 will be added to the file directly.
	pr.println(100);
	
	pr.println(true);
	pr.println('c');
	pr.println("durga");
	pr.flush();
	pr.close();
}
}
