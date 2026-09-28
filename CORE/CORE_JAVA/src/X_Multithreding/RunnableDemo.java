package X_Multithreding;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<9;i++) {
			
			// Child Thread
		System.out.println("Child Thread:");
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		// In Runnable interface start methods is not there . present in Thread class. 
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
	    
         for(int i=0;i<9;i++) {
			
			// Main Thread
		System.out.println("Main Thread:");
	   }
}
}
