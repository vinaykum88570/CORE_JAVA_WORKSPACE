package nov2026;

public class RunnableDemo implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
			}
		
	}
	
	
	public static void main(String[] args) {
		RunnableDemo demo = new RunnableDemo();
		Thread t = new Thread(demo);
		t.start();

		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}

	}



}
