package T_Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMergeExample {
public static void main(String[] args) throws Exception{
	// 
	
	PrintWriter pw = new PrintWriter("C:/Users/admin/JAVA_WORKSPACE/Files/3.txt");
	
	BufferedReader br = new BufferedReader(new FileReader("C:/Users/admin/JAVA_WORKSPACE/Files/1.txt"));
	String line = br.readLine();
	while(line != null) {
		pw.println(line);
		line = br.readLine();
	}
	 
	br = new BufferedReader(new FileReader("C:/Users/admin/JAVA_WORKSPACE/Files/2.txt"));
	line = br.readLine();
	while(line != null) {
		pw.println(line);
		line = br.readLine();
	}
	
	pw.flush();
	br.close();
	pw.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
