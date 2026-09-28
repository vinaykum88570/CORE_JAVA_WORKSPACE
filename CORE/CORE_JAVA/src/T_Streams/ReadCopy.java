package T_Streams;

import java.io.*;

public class ReadCopy {
public static void main(String[] args) {
	try {
		File f = new File("C:\\Users\\admin\\JAVA_WORKSPACE\\php.txt");
	FileInputStream fis = new FileInputStream(f);
	int x=fis.available();
	byte[] b= new byte[x];
	fis.read(b);
	
	FileOutputStream fos = new FileOutputStream("C:\\POCO M4 PRO\\Html.txt");
	fos.write(b);
	System.out.println("File write Sucessfully.........!");
	fis.close();
	}catch(Exception e) {
		System.err.println("file not found.........!");
	}
	
}
}
