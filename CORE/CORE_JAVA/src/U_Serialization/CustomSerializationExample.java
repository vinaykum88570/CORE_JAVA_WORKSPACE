package U_Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Account implements Serializable{
	String username = "durga";
	transient String pwd="anushka";
	private void writeObject(ObjectOutputStream os )throws Exception{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception{
		is.defaultReadObject();
		String epwd =(String)is.readObject();
		pwd=epwd.substring(3);
	}
}
public class CustomSerializationExample {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Account a1 = new Account();
	System.out.println(a1.username+"..."+a1.pwd);
	File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/ObjectSeialization.txt");
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a1);
	
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Account a2 = (Account)ois.readObject();
	System.out.println(a2.username+"..."+a2.pwd);
}
}
