package X_Multithreding;

class Test extends Thread{
	
}
public class ThreadNameDemo {

	public static void main(String[] args) {
		 
		// getName()
		System.out.println(Thread.currentThread().getName()); // main
		
		Test t = new Test();
		
		// Thread created
		System.out.println(t.getName()); // Thread-0
		
		// setName()
		Thread.currentThread().setName("JAVA");
		
		System.out.println(Thread.currentThread().getName()); // JAVA
		
		System.out.println(10/0);// Exception in thread in JAVA
	}
}
