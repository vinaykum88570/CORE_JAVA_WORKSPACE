package U_Serialization;

import java.io.*;

class Student implements Serializable {
	String name;
	String sName;
	public Student(String name , String sName) {
		this.name=name;
		this.sName=sName;
	}
	
	
}
public class Serial_Deserialization {
public static void main(String[] args) {
	 try {
		 File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/ObjectSeialization.txt");
		 
		 // Creating object to make serialization Object
		 Student name = new Student("Rohit ", "kamble");
		
		 // For writing Object 
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		 
		 oos.writeObject(name);
		 // Written Object to a file
		 oos.close();
		 
		 // For Reading object
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		  
		 // Convert Object to Object
		 Student s = (Student) ois.readObject();
		 
		 
		 System.out.println("Name :=>"+s.name + "surName :=>"+ s.sName );
		 
		 // close file
		 ois.close();
		 
		 
		 
		 
		 
		 
	 }catch (Exception e) {
		
	}
}
}
