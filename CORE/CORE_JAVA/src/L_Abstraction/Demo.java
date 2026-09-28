package L_Abstraction;

abstract class A{
	public A() {
		System.out.println("Welcome:");
	}
	 static void print() {
		System.out.println("Welcome");
	}
	 
	 
	
}
 public class Demo extends A{
	// implicitly super() present in programme
	
	
	 public static void main(String[] args) {
		  print();
			System.out.println("main method ");
		}
		


}
