package Y_Syncronization;

class T extends Thread{
	
}
public class DaemonDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());//false
		T t = new T();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		System.out.println(t.isDaemon()); //true
	}
}
