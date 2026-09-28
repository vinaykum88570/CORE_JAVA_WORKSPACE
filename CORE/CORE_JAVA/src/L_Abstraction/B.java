package L_Abstraction;


abstract class Ab{
	
	 abstract  void show();
	void print() {
		System.out.println("print () method");
	}
}
public class B extends Ab  {
	
	void show() {
		System.out.println("show method");
	}
	void display(){
		System.out.println("display method");
	}
	
	public static void main(String[] args) {
		 B ob = new B();
		 ob.show();
		 ob.print();
		 ob.display();
		 
		 
		 
	}

}
