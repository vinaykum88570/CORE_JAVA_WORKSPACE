package E_Super;

class A{
	int x=10;
	void show() {
		System.out.println("A class ");
	}
	
}
public class B extends A {
	void show() {
		System.out.println("B class");
	}
	int x=20;
	void print() {
	
		this.show(); 
		super.show();
		
//		int x=30;
//		System.out.println(x);//30
//		System.out.println(this.x);//20
//		System.out.println(super.x);//10
	}
	
 public static void main(String[] args) {
	B b = new B();
	b.print();
}
}
