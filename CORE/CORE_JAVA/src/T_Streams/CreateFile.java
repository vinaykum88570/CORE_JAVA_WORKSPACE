package T_Streams;


import java.io.File;
import java.io.IOException;

class CreateFile {
public static void main(String[] args) {
	try {
		File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/Demo.txt");
		
		if(file.createNewFile()) {
			System.out.println("File Created: "+ file.getName());
		}
		else {
			System.out.println("File already exists:");
		}
	}catch(Exception e) {
		System.out.println("An error occurred.......!");
		e.printStackTrace();
	}
}
}
