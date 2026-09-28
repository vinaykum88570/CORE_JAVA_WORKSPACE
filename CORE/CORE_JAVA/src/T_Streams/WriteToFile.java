package T_Streams;

import java.io.FileWriter;

public class WriteToFile {
public static void main(String[] args) {
	
	try {
		FileWriter fileWrite = new FileWriter("C:/Users/admin/JAVA_WORKSPACE/Files/Demo.txt");
		fileWrite.write(" This line is Comming from WriteToFile class in  V_Stream_API package .");
		fileWrite.close();
		System.out.println("Successfully wrote to the file.");
	}catch (Exception e) {
		System.err.println("An error occurred...........!");
		e.printStackTrace();
	}
}
}
