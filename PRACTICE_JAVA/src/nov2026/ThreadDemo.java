package nov2026;


public class ThreadDemo extends Thread {

	static Thread th;
	@Override
	public void run() {
		try {
			th.join();
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread");
		       
				}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		th = Thread.currentThread();
		
		ThreadDemo demo = new ThreadDemo();
	
		demo.start();
		
		
		for(int i=0;i<5;i++) {
		
		System.out.println("Main Thread");
		
		}

	}

}
