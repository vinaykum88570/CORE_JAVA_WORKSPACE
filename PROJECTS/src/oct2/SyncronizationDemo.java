package oct2;


class Demo extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Child Thread");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class SyncronizationDemo{
	
	public static void main(String[] args) throws InterruptedException {
	       Demo d = new Demo();
	       d.start();
	       for(int i=10;i>=1;i--) {
	    	   System.out.println(Thread.currentThread().getState());
	    	   System.out.println(i);
	    	}
	}
}
