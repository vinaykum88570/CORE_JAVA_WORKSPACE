package C_Java_Streams;

import java.io.*;


public class PrintStreamClassMethods {
/**
 * @param args        PrintStreamClassMethods
 *                    java.io.PrintStream
 */

public static void main(String[] args) throws Exception {
	
	PrintStream ps = new PrintStream("C:/Users/admin/OneDrive/Documents/methods.txt");
	
	// println()
	ps.println(123);
	
	// printf()
	ps.printf("Name , %s , Age: %dn" , "Alice", 30);
	
	// append()
	ps.append("This is append text");
	 
	// flush()
	ps.flush();
	
	// close()
	ps.close();
	
	
	
	
	
	
	
	
	
	
	
}
}
