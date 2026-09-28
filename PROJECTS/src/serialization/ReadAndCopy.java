package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndCopy {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:/Users/admin/OneDrive/Desktop/Demo/CreateFile.txt");
			
			FileInputStream fis = new FileInputStream(file);
			int x = fis.available();
			byte[] b= new byte[x];
			fis.read(b);
			
			File copyfile = new File("C:/Users/admin/OneDrive/Desktop/Demo/copyCreateFile.txt");
			FileOutputStream fos = new FileOutputStream(copyfile);
			fos.write(b);
			System.out.println("write succrssfully");
			fos.close();
			
		} catch (Exception e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		
	}
	
	

}
