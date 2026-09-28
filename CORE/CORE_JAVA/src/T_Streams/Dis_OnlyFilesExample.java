package T_Streams;

import java.io.File;

public class Dis_OnlyFilesExample {
public static void main(String[] args) {
	int count =0;
	File f = new File("C:/Users/admin/JAVA_WORKSPACE/Files");
	
	String [] s =f.list();
	
	for(String s1 : s) {
		File f1 = new File(f, s1);
		if(f1.isDirectory()) {
			count++;
			System.out.println(s1);
		}
	}
	System.out.println("The total number of Files:"+ count);
}
}
