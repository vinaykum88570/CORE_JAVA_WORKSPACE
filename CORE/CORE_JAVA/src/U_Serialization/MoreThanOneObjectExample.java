package U_Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	Cat c= new Cat();
}
class Cat implements Serializable{
	Rat r = new Rat();
}
class Rat implements Serializable{
	int j = 20;
}

public class MoreThanOneObjectExample {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	Dog d1 = new Dog();
	
	File file = new File("C:/Users/admin/JAVA_WORKSPACE/Files/ObjectSeialization.txt");
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
	
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();
	System.out.println(d2.c.r.j);
}
}
