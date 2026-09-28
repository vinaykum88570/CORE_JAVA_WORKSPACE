package Pr1;

import java.beans.IntrospectionException;
import java.util.Iterator;

public class ThreadDemo extends Thread {

	int total = 0;
		
	public void run() {
		
		synchronized (this) {
			System.out.println("Child Thread start calculation");
			for(int i=1; i<=10; i++ ) {
				total = total + 1;
				try {
					Thread.sleep(2000);
					System.out.println(total);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("Child Thread notify");
			this.notify();
		}
			
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {	
	
		ThreadDemo td = new ThreadDemo();
		
		td.start();
		
		
		synchronized (td) {
			td.wait();
			for(int i=1;i<=10;i++) {
				
				System.out.println("Main Thread");
			}
		}
		
		
		
	}

	
	
}
