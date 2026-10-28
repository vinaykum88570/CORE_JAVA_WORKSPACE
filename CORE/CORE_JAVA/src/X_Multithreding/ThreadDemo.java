package X_Multithreding;

class MyThread extends Thread{

	public void run() {
        for(int i=0;i<9;i++) {
			
			// Child Thread
		System.out.println("Child Thread:");
		}
	}
}
public class ThreadDemo {
public static void main(String[] args) {
	
	MyThread m = new MyThread();
	Thread t = new Thread(m);
	t.start();
	
	for(int i=0;i<9;i++) {
		
		// Main Thread
	System.out.println("Main Thread:");
	}
	
	
}
}
