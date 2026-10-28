package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 implements Serializable{
	 int empNo;
	 float salary;
	
}
public class SerializationEx {

	public static void main(String[] args) {
	
	try {
		File file = new File("C:/Users/admin/OneDrive/Desktop/Demo.txt");
		
	    FileInputStream fis = new FileInputStream(file);
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Demo1 demo = (Demo1)ois.readObject();
	    
	    System.out.println(demo.empNo);
	    System.out.println(demo.salary);		
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
