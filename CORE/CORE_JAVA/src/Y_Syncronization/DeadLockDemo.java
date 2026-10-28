package Y_Syncronization;

class D{
	public  synchronized void d1(E e) {
		System.out.println("Thread 1 starts execution of d1() ");
		try {
			Thread.sleep(6000);
		}catch(InterruptedException ie) {
			System.out.println("Thread 1 trying to call B's last()");
			e.last();
		}
	}
	public synchronized void last() {
		System.out.println("inside D , this is last() method");
	}
}	
class E{
	public  synchronized void d2(D d) {
		System.out.println("Thread 2 starts execution of d2() method ");
		try {
			Thread.sleep(6000);
		}catch(InterruptedException ie) {}
		System.out.println(" Thread 2 trying to call D's last methods");
		d.last();
	}
	public  synchronized void last() {
		System.out.println("Inside B , this is last() methods ");
	}
}
public class DeadLockDemo extends Thread {

	D d = new D();
	E e = new E();
   public void m1() {
	this.start();  
	d.d1(e);// This line executed by main Thread.
   } 
   public void run() {
	   e.d2(d); // This line executed by child Thread.
   }
   public static void main(String[] args) {
	DeadLockDemo dd = new DeadLockDemo();
	dd.m1();
   }
}	
	


