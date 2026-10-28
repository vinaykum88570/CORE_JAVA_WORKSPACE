package C_Java_Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClassMethods {

/**
 * @param args             BufferWriterClassMethods
 *                         java.io.BufferWriter
 *  
 */
public static void main(String[] args) throws IOException {
	// We can use bufferWrite to write a character data to a file
	// BufferWriter Can't communicate directly with the file, it can communicate with Writer Onject.
	
	FileWriter fr = new FileWriter("C:/Users/admin/JAVA_WORKSPACE/Files/WriteFile.txt");
	BufferedWriter br = new BufferedWriter(fr);
	
	
	// write(int ch)
	br.write(100); // d
	
	//newLine() - next line
	br.newLine();
	
	// write(char[] ch)
    char[] ch = {'a','b','c','d'};
    br.write(ch);
    
	// write(String s)
	br.write("BufferWriter:");
	
	// flush()
	br.flush();
	
	// close() 
	br.close();
	
	// closing buffer writer automatically internal fileWriter will be close we are not required to close explicitly. 
	
	
	
	
	
	
	
	
	
	
	
	
}
}
