package X_Multithreding;


class Threads implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;1<=2;i++) {
			Thread.currentThread().setName("Kumdale");
			System.out.println("Child Class "+Thread.currentThread().getName());
		}
		
	}
}
public class NameOfThread {
	public static void main(String[] args) {
		Threads t = new Threads();
		Thread t1 = new Thread(t);
		t1.start();
		t1.setName("Vinay");
		String name = t1.getName();
		
		for(int i=1;1<=2;i++) {
			System.out.println("Main Class " + name);
		}
		
	}
}
