package U_Serialization;

import java.io.*;


class Emp implements Serializable{
	// we can serialize only serialiable object .
	// object send to be serializable even only if the curresponding  class implements serializable intraface.
	
	  int empNo=101;
	 float salary=5000.0f;
}
public class ObjectSeria_DeSerialization {
	
	public static void main(String[] args) {
		try {
			
		File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/ObjectSeialization.txt");
			
		//By using FileOutputStream & ObjectOutputStream Classes implement Seralization. 
		
			// Serialization 
		Emp e1 = new Emp();
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		fos.close();
		
		// By using FileInputStream & ObjetInputStream Classes we can implement De-Serialization. 
		
		    // Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e2 = (Emp)ois.readObject();
		fis.close();
		fos.close();
		
		System.out.println("Emp No:="+e2.empNo);
		System.out.println("Emp Salary:="+ e2.salary);
		}catch(IOException |  ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
