package T_Streams;

import java.io.File;

public class Dis_ListOfFilesExample {
public static void main(String[] args) {
	int count =0;
	File f = new File("C:\\Users\\admin\\JAVA_WORKSPACE\\Files");
	String [] s = f.list();
	for(String s1 : s) {
		
		count++;
		System.out.println(s1);
	}
	System.out.println("The total number :"+count);
}
}
