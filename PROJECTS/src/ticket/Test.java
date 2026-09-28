package ticket;

import java.util.LinkedList;

public class Test extends Thread {

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				
				Thread.sleep(2000);
				System.out.println("Child Thread");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		 Test t = new Test();
		 t.start();
		 try {
			 for(int i=0;i<10;i++) {
				 Thread.sleep(1000);
				 System.out.println("Main Thread");
				}
			
		 }catch (Exception e) {
			
		}
	}
	
	
}


