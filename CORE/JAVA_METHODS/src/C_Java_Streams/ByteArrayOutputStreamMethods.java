package C_Java_Streams;

import java.io.*;

public class ByteArrayOutputStreamMethods {
	/**
	 *        ByteArrayOutputStreamMethods
	 *        java.io.ByteArrayOutputStream
	 * 
	 */
public static void main(String[] args) throws IOException {

	
	
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	
	
	
	// size()
	System.out.println("size ===>"+baos.size());        // 0 
	 
	// write()
	baos.write(65);                     // Writes byte 'A'
	
	// getByteArray()
	byte[] result = baos.toByteArray();
	System.out.println("getByteArray ===>"+new String(result));   //  o/p A
	
	// getBytes()
	byte [] data = "Hello World".getBytes();                 // 72 101 108 108 111
	System.out.println("getBytes ===>"+data[0]+" "+ data[1]+" "+ data[2]+" "+ data[3]+" "+ data[4]);
	 
	// toByteArray()
	baos.write("Hello Java:".getBytes());
	byte[] byteArray = baos.toByteArray();
	System.out.println("toByteArray ====>"+byteArray.length); // 12
	
	// toString
	baos.write("Java".getBytes());
	System.out.println("toString ====> "+baos.toString());   // AHello Java:Java

	// reset()
	baos.reset();
	
	// close()
	baos.close();
	
	// writeTo()
	baos.write("This text comming from ByteArrayOutputStreamMethods".getBytes());
	try(FileOutputStream fos = new FileOutputStream("C:/Users/admin/JAVA_WORKSPACE/Files/WriteFile.txt")){
		baos.writeTo(fos);
		System.out.println("Data Written to file Successfully.");
	}
}

}
