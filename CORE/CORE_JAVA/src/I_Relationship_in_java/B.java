package I_Relationship_in_java;

class A {
	
	void show() {
		System.out.println("A class");
	}
	void print() {
		System.out.println("Print method");
	}
	
}
public class B  extends A {
	
	void show () {
		System.out.println("B class");
	}
	void display() {
		System.out.println("display method");
	}
	
 public static void main(String[] args) {
	B ob2 = new B();
	
	
	
}
}
