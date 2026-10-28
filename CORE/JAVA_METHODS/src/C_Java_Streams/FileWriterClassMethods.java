package C_Java_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClassMethods {
/**
 * @param args     FileWriterClassMethods
 *                 java.io.FileWriter
 * @throws IOException 
 * 
 */
public static void main(String[] args) throws IOException {
	
	// Usages of FileWrite and FileRead is not recommended becouse 
/*	- while writing data by filewiter we have insert line sperator manually which is varied from system to system difficult to proggrammer
     
*/	
	FileWriter fw = new FileWriter("C:/Users/admin/JAVA_WORKSPACE/Files/Write.txt",true);
	
	
	// write(int ch) - to write a single character
	fw.write('a');
	fw.write(97);
	
	// write(char[] ch) - to write an Array & Character
	char [] ch = {'a','b','c','d'};
	fw.write(ch);
	
	// write(String s) - to write String to the file
	fw.write("welcome o java : ");
	
	// flush() - to give the gurantee total data including last caharacter will be written to the file.
	fw.flush();
	
	// close() - to close the writer
	fw.close();
	
	
	
	
}
}
