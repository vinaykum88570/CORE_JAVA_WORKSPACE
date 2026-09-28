package X_Multithreding;

class Thr extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		}catch (InterruptedException e) {
		}
		
        for(int i=0;i<9;i++) {
		   // Child Thread
		System.out.println("Child Thread:");
		}
	}
}
public class JoinDemo2 {

	public static void main(String[] args) {
		
		Thr.mt=Thread.currentThread();
		
		Thr t = new Thr();
		t.start();
		
		for(int i=0;i<9;i++) {
			   // Main Thread
			System.out.println("Main Thread:");
	      }
		}
}
