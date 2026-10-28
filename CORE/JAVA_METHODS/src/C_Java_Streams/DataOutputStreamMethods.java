package C_Java_Streams;

import java.io.*;


public class DataOutputStreamMethods {
	/**
	 *         DataOutputStreamMethods
	 *         java.io.DataOutputStream
	 */
public static void main(String[] args) {
	
	try {
	File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/WriteFile.txt");
	FileOutputStream fos = new FileOutputStream(file);
    DataOutputStream dos = new DataOutputStream(fos);
    
    // writeChars()
    dos.writeChars("Data Input Stream :");
    
    // writeInt(123)
    dos. writeInt(123);
   
    // writeByte
    dos. writeByte(8);
    
    // writelong()
    dos.writeLong(100L);
    
    // writeShort()
    dos.writeShort(12);
    
    // writeBoolean
    dos.writeBoolean(false);
    
    // size()
    System.out.println("Size :"+dos.size());
    
    // flush()
    dos.flush();
    
    // close()
    dos.close();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
