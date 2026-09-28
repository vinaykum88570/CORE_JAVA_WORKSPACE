package X_Multithreding;

class YThread extends Thread{
	
	public void run() {
		 for(int i=0;i<9;i++) {
				
				// Child Thread
			System.out.println("Child Thread:");
			// Until completing Main Thread child Thread wait.
			Thread.yield();
			}
	}
}
public class YieldDemo {

	public static void main(String[] args) {
		YThread t = new YThread();
		t.start();
		
		 for(int i=0;i<9;i++) {
				
				// Main Thread
			System.out.println("main Thread:");
			
			}
	}
}
