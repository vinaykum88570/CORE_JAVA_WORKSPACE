	package D_Inherita;


class A{
	int x=10;// Instance variable
	
	
}

public class B extends A{
	int x=20;
	void print() {
		int x=30;// Local variable 
		
		System.out.println(x);// 30
		System.out.println(this.x); // 20
		System.out.println(super.x);//not emplicitly only Explicitly. 10
	}
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}
