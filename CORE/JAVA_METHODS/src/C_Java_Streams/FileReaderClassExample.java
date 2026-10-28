package C_Java_Streams;

import java.awt.event.MouseWheelListener;
import java.io.File;
import java.io.FileReader;

public class FileReaderClassExample  {
public static void main(String[] args)throws Exception{
	
	// By using FileReader we can read data character by character which is not convenient to programmer.  
	
	File f = new File("C:/Users/admin/JAVA_WORKSPACE/Files/Write.txt");
	FileReader fr = new FileReader(f);
	
	// Read() - return in unicode value
	int x = fr.read();
	System.out.println("Read :=>"+ fr.read());
	
	// Read all data using while loop
	while (x != -1) {
	System.out.print((char)x);
	x = fr.read();
	}

	// read(char[] ch) - to read n of character from the file array  and return number of chracter copied.
	char [] ch = new char[(int)f.length()];
	fr.read(ch);
	System.out.print("Read(char[] ch):=>");
	for( char c : ch) {
		System.out.print(c);
	}
	
	// close()
	fr.close();
   
	
	
	
}

}
