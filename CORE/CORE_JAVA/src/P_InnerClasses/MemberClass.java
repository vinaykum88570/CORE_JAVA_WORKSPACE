	package P_InnerClasses;


class A{
	// Member class or Normal or Regular inner class
	  class B{
		
		public void display() {
			System.out.println("Inner class");
		}
	}
}
public class MemberClass {
public static void main(String[] args) {
	// Outer class Object created
    A a = new A();
    A.B b = a.new B();
    b.display();
    
}
}
