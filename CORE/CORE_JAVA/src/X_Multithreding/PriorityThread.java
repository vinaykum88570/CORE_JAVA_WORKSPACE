package X_Multithreding;

class priority extends Thread{
	
}

public class PriorityThread {

	public static void main(String[] args) {
		
		// Default Priority
		System.out.println(Thread.currentThread().getPriority()); // 5
		
		// Add Priority 
		Thread.currentThread().setPriority(8);
		
		priority p = new priority();
        System.out.println("GetPriority:==>"+p.getPriority());
		
		// Now priority is 8
		System.out.println(Thread.currentThread().getPriority()); //8
		
		// Error
//		Thread.currentThread().setPriority(12); // IllegalArgumentException
		
		
	}
}
