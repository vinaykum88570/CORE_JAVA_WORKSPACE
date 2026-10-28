package C_Java_Streams;

import java.io.*;
import java.util.*;

public class ObjectOutputStreamMethods {

	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream("C:/Users/admin/JAVA_WORKSPACE/Files/WriteFile.txt");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)){
			 
       // Write various data types
			
       oos.writeObject("Hello Java World");
       oos.writeUTF("UTF-8 String Example");
       oos.writeInt(42);
       oos.writeDouble(3.14159);
       oos.writeBoolean(true);
       oos.writeChar('A');
       oos.writeByte(127);
       oos.writeShort(1000);
       oos.writeLong(999999999L);
       oos.writeFloat(2.718f);
       oos.writeObject(new Date());
     
       // Write byte array
       byte[] byteArray = {1, 2, 3, 4, 5};
       oos.writeObject(byteArray);
       
       oos.close();
       }
	
	   
   }
}
