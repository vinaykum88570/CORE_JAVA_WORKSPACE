package serialization;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Demo\\CreateFile.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println(file +"==> File Created");
			}else {
				System.out.println("File Already Exit");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.......!");
			e.printStackTrace();
		}

	}

}
