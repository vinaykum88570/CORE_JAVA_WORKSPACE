package C_Java_Streams;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public class FileInputStreamClassMethods {
	/**
	 *          FileInputStreamClassMethods
	 *          java.io.FileInputStream
	 * 
	 */
public static void main(String[] args) throws Exception  {
	// to Read the Binary data from the file.
	
	
	// Open file for reading 
	FileInputStream fis = new FileInputStream("C:/Users/admin/JAVA_WORKSPACE/JAVA_METHODS/src/methods.txt");
	
    
   // available()
   System.out.println(  fis.available());
   
   // read()
   System.out.println((char)fis.read());
   
   // read(byte[])
   byte[] buf = new byte[10];
   System.out.println(fis.read(buf));
   
   // skip()
   System.out.println(fis.skip(5));
   
   // read(byte[],off,len)
   int byteRead = fis.read(buf,2,3); 
   System.out.println(new String(buf,2,byteRead));
   
   // getChannel()
   FileChannel channel =fis.getChannel();
   System.out.println("Channel "+channel.size());
   
   // getFD()
   System.out.println(fis.getFD());
   
   // close()
   fis.close();
   
   


	
	
	
	
	
	
	
	
	
	
	
	
}
}
