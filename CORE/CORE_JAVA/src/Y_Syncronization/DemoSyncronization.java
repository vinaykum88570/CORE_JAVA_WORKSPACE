package Y_Syncronization;



class Display{
	public synchronized void wish(String name) throws InterruptedException {
		for(int i=0;i<10;i++) {
		System.out.println("Good Morning:"+ name);
		TestThread.sleep(2000);
			
		}
	}
}
class TestThread extends Thread{
	Display d;
	String name;
	public TestThread(Display d,String name) { 
		this.d=d;
		this.name=name;
	}
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
public class DemoSyncronization {
  public static void main(String[] args) {
	
	Display d = new Display();
	TestThread t1 = new TestThread(d, "Dhoni");
	TestThread t2 = new TestThread(d, "Yuvraj");
	t1.start();
	t2.start();
	
}
}
