package C_Java_Streams;
import java.io.*;
import java.util.*;


public class ObjectInputStreamMethods {

/**
 *                 ObjectInputStreamMethods
 *                 java.io.ObjectInputStream           
 * 
 * 
 */
    public static void main(String[] args) throws Exception {
  
                // First we Write Data into a File
    	
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
              

 } 
        
        try (FileInputStream fis = new FileInputStream("C:/Users/admin/JAVA_WORKSPACE/Files/WriteFile.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
        	
            
            // 1. readObject() - Read objects
            System.out.println("\n1. readObject():");
            String str = (String) ois.readObject();
            System.out.println("   String: " + str);
            
            // 2. readUTF() - Read UTF string
            System.out.println("\n2. readUTF():");
            String utfStr = ois.readUTF();
            System.out.println("   UTF String: " + utfStr);
            
            // 3. readInt() - Read integer
            System.out.println("\n3. readInt():");
            int intValue = ois.readInt();
            System.out.println("   Integer: " + intValue);
            
            // 4. readDouble() - Read double
            System.out.println("\n4. readDouble():");
            double doubleValue = ois.readDouble();
            System.out.println("   Double: " + doubleValue);
            
            // 5. readBoolean() - Read boolean
            System.out.println("\n5. readBoolean():");
            boolean boolValue = ois.readBoolean();
            System.out.println("   Boolean: " + boolValue);
            
            // 6. readChar() - Read character
            System.out.println("\n6. readChar():");
            char charValue = ois.readChar();
            System.out.println("   Char: " + charValue);
            
            // 7. readByte() - Read byte
            System.out.println("\n7. readByte():");
            byte byteValue = ois.readByte();
            System.out.println("   Byte: " + byteValue);
            
            // 8. readShort() - Read short
            System.out.println("\n8. readShort():");
            short shortValue = ois.readShort();
            System.out.println("   Short: " + shortValue);
            
            // 9. readLong() - Read long
            System.out.println("\n9. readLong():");
            long longValue = ois.readLong();
            System.out.println("   Long: " + longValue);
            
            // 10. readFloat() - Read float
            System.out.println("\n10. readFloat():");
            float floatValue = ois.readFloat();
            System.out.println("   Float: " + floatValue);
            
            // 11. read() - Read single byte
            System.out.println("\n11. read():");
            ois.mark(100); // Mark current position
            int singleByte = ois.read();
            System.out.println("   Single byte: " + singleByte);
            
            // 12. read(byte[] buf) - Read into byte array
            System.out.println("\n12. read(byte[] buf):");
            byte[] buffer = new byte[5];
            int bytesRead = ois.read(buffer);
            System.out.println("   Bytes read: " + bytesRead);
            System.out.println("   Buffer content: " + Arrays.toString(buffer));
            
            // 13. skipBytes() - Skip bytes
            System.out.println("\n13. skipBytes():");
            int skipped = ois.skipBytes(2);
            System.out.println("   Skipped bytes: " + skipped);
            
            // 14. available() - Check available bytes
            System.out.println("\n14. available():");
            int available = ois.available();
            System.out.println("   Available bytes: " + available);
            
            // 15. readUnshared() - Read unshared object
            System.out.println("\n15. readUnshared():");
            Date date = (Date) ois.readObject();
            System.out.println("   Date: " + date);
            
            // 16. readObject() - Read byte array
            System.out.println("\n16. readObject() - Byte array:");
             byte[] byteArray = (byte[]) ois.readObject();
            System.out.println("   Byte array: " + Arrays.toString(byteArray));
            
            // 17. close()
            ois.close();
   
        }
    }
}
