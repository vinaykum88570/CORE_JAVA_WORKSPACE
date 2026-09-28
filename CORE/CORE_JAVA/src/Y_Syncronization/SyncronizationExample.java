package Y_Syncronization;

class Display1{
	public synchronized void displayn() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			}
		}
	}
	public synchronized void displayc() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			}
		}
	}
}
class MyThreadt extends Thread{
	Display1 d;
	MyThreadt(Display1 d){
		this.d=d;
	}
	public void run() {
		d.displayn();
	}
			
}
class MyThreads extends Thread{
	Display1 d;
	MyThreads(Display1 d){
		this.d=d;
	}
	public void run() {
		d.displayc();
	}
			
}
public class SyncronizationExample {
   public static void main(String[] args) {
	Display1 d = new Display1();
	MyThreadt t1 = new MyThreadt(d);
	MyThreads t2 = new MyThreads(d);
	t1.start();
	t2.start();
	
}
}
