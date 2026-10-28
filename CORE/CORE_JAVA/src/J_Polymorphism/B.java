package J_Polymorphism;

class A{
	
}
public class B extends A{
	public static void main(String[] args) {
		
////////////////////////////////////////////////////
		
		//Downcasting.
	  A ob = new A();
	  B ob2=(B)ob;
	  
	  A ob3 = new B();
	B ob4=(B)ob3;
		
		
	}
}