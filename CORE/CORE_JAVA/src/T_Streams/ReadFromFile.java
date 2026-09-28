package T_Streams;

import java.io.*;
import java.util.Scanner;

public class ReadFromFile {
public static void main(String[] args) {
	try {
		File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/Demo.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	 }catch (FileNotFoundException e) {
	    System.out.println("An error Occurred :");
		e.printStackTrace();
	}
	
	
}
}
