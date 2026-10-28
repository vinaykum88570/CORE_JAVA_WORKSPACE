package X_Multithreding;

class A extends  Thread{
	
	public void run() {
        for(int i=0;i<9;i++) {
			// Child Thread
		System.out.println("Child Thread:");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
		}
		}  
	}
}

public class JoinDemo {
	
   public static void main(String[] args) throws InterruptedException {
	A a = new A();
	a.start();
	// main thread has to wait 
	a.join();
	
	for(int i=0;i<9;i++) {
		// Child Thread
	System.out.println("Main Thread:");
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
	}
	}  
   }
}
