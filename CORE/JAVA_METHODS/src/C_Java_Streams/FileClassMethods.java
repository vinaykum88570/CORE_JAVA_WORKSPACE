package C_Java_Streams;

import java.io.*;

public class FileClassMethods {
	/**
	 *        FileClassMethods
	 *        java.io.File
	 * 
	 */
public static void main(String[] args)throws Exception {
	

	File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/Demo.txt");
	
	
	// exits()
	System.out.println("File Exists: "+ file.exists());
	
	// getName()
	System.out.println("File Name: "+ file.getName());
	
	// getAbsolutePath()
	System.out.println("Absulate path "+ file.getAbsolutePath());
	
	// getpath()
	System.out.println("Path :"+ file.getPath());
	
	// getParent()
	System.out.println("Parent path:"+ file.getParent());
	
//=============================================================================
	// File properties
	
	// isFile()
	System.out.println("Is File:"+ file.isFile());
	
	// isDirectory()
	System.out.println("Is Directory:"+ file.isDirectory());
	
	// isHidden()
	System.out.println("Is Hidden:"+ file.isHidden());
	
	// canRead()
	System.out.println("Can Read:"+ file.canRead());
	
	// canWrite()
	System.out.println("Can Write:"+ file.canWrite());
	
	// canExecut()
	System.out.println("Can Excutive:"+file.canExecute());
	
	// length()
	System.out.println("Length (bytes) :"+ file.length());
	
	// lastModified()
	System.out.println("Last Modified :"+ file.lastModified());
	
//=============================================================================
	// Creation and Deletion
	
	File newFile = new File("C:/Users/admin/JAVA_WORKSPACE/Files/NewDemo.txt");
	
	// createNewFile()
	System.out.println("Create New File :"+ newFile.createNewFile());  // if created then false 
	
	// delete()
	System.out.println("File deleted :"+newFile.delete());
	
//==================================================================================
	// Create Temporary file
	
	File temFile = File.createTempFile("temp", ".tmp");
	
	// getAbsolutePath()
	System.out.println("Temp file Created:"+ temFile.getAbsolutePath());
	
	// Delete() on exit 
	System.out.println(temFile.delete());
	
//===================================================================================
	//Directory Operations
	
	File dirFile = new File("C:/Users/admin/JAVA_WORKSPACE/Files/NewDemo.txt");
	
	// mkdir()
	System.out.println("Make Directory :"+dirFile.mkdir());  // 
	
	// mkdirs()
	System.out.println("Multiple Directory :"+dirFile.mkdirs());
	
    // list() - Display list of file.
	
	
	
}
}
