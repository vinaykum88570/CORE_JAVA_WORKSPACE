package X_Multithreding;

public class DeadLockDemo {
	
public static void main(String[] args) throws InterruptedException {
	
	Thread.currentThread().join();
	// DeadLock 
	/*
	 *  if thread call join() methods and same thread it self then the programm wiil be stucked .
	 *  (somthing like Deadlock) in this case thred has to wait infinite amount of time
	 *  
	 */
}
}
