package T_Streams;

import java.io.*;

public class ReadWriteFile {
public static void main(String[] args) {
	try {
		File f = new File("C:/Users/admin/OneDrive/Desktop/Demo/CreateFile.txt");
	FileInputStream fis = new FileInputStream(f);
	int x=fis.available();
	byte[] b= new byte[x];
	fis.read(b);
	String s = new String(b);
	System.out.println(s);
	}catch(Exception e) {
		System.err.println("file not found.........!");
	}
}
}
