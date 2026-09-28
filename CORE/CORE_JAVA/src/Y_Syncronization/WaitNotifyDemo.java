package Y_Syncronization;


class ThreadB extends Thread{
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calculation.");
			for(int i=0;i<=100;i++) {
				total = total +1;
				try {
					Thread.sleep(2000);
					System.out.println(total);
				}catch (InterruptedException e) {
				}
			}
			System.out.println("child Thread giving notification.");
			this.notify();
		}
	}
}
public class WaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {				
			System.out.println("main thread calling main Thread.");
			b.wait();
			System.out.println("Main thread got notification");
			System.out.println(b.total);
		}
	}
}
