package T_Streams;

import java.io.*;

public class FileInformation {
public static void main(String[] args) {
	File file  = new File("C:/Users/admin/JAVA_WORKSPACE/Files/Demo.txt");
	
	if(file.exists()) {
		System.out.println("File name: "+ file.getName());
		System.out.println("Absulate path :"+ file.getAbsolutePath());
		System.out.println("Writeable :"+ file.canWrite());
		System.out.println("Readable :"+ file.canRead());
		System.out.println("File size in bytes :"+ file.length());
	}
	else {
		System.out.println("The file does not Exit:");
	}
}
}
