package C_Java_Streams;

import java.io.*;

public class InputStreamClassMethods {
	
/**
 * @param args       InputStreamClassMethods
 *                   java.io.InputStream 
 * 
 */
public static void main(String[] args) {
	// 
	

	byte []  b = {65 , 66 , 67 , 68 , 69};
	InputStream is = new ByteArrayInputStream(b);
	
	try {
		// available()
		System.out.println("1] Available ====> "+ is.available());
		
		// markSupported()
		if(is.markSupported()) {
			is.mark(0);
			System.out.println(); 
		}
		
		// read()
		System.out.println("2] SingleRead ====>");
		for(int i=0;i<=4;i++) {
			int singleByte =is.read();
			System.out.println((char)singleByte);
		}
		
		// read byte array
		byte [] buffer = new byte[2];
		int byteRead = is.read(buffer);
		System.out.println("3] Read Into Buffer:");
		for(int i=0;i<byteRead;i++) {
			System.out.println((char)buffer[i]+" ");
		}
		
		// skip()
		long skipped =is.skip(1);
		System.out.println("4] Skipped bytes:"+ skipped);
		
		// read after skip()
		int nextByte = is.read();
		System.out.println("5] Next byte after skip:"+(char)nextByte);
		
		// Reset back to marked position 
		if(is.markSupported()) {
			is.reset();
			System.out.println("6] After reset, read byte:"+ (char)is.read());
		}
		
		// close()
		is.close();
		System.out.println("7] Closed:");
		

//======================================================================================================
		
		
		// read()
		FileInputStream fis = new FileInputStream("C:/Users/admin/OneDrive/Documents/methods.txt");  //  Hello
		byte [] by = new byte[fis.available()];
		fis.read(by);
		String s = new String(by);
		System.out.println("8] Read Methods =====>"+s);
		
	}catch(IOException e) {
		
		
		
		
	};
	
	
}
}
