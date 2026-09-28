package C_Java_Streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderClassMethods {
/**
 * @param args       BufferedReaderClassMethods
 *                   java.io.BufferedReader
 */
public static void main(String[] args)throws Exception {
// we can use to read caharachter data from the file
// the main advantage of bufferReader  whe compared with FilWrider is we can read data line by line in - character to character 
	
	FileReader fr = new FileReader("C:/Users/admin/JAVA_WORKSPACE/Files/Write.txt");
	BufferedReader br = new BufferedReader(fr);
	
	String line =br.readLine();
	while (line != null) {
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
	// to closing BufferedReader automatically underline fileReader will be closed , we are not to require close explicitly.
	// the most enhance Reader to read characher data to a file is bufferedReader.
	
}
}
