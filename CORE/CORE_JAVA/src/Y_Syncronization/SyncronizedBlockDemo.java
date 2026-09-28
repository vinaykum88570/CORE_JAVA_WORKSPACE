package Y_Syncronization;
class A{
	public  void wish(String name)  {
		;;;;;;;;; // 1 lakh lines of code
		
		synchronized (A.class) {
			for(int i=0;i<10;i++) {
				System.out.println("Good Morning:"+ name);
				try {
					TestThread.sleep(2000);
				}catch(InterruptedException e) {
				}
			}
		}
		;;;;; // 1 lakh of lines code
	}
}
class B extends Thread{
	A a;
	String name;
	public B(A a,String name) { 
		this.a=a;
		this.name=name;
	}
	public void run() {
		a.wish(name);
	}
}
public class SyncronizedBlockDemo {

	public static void main(String[] args) {
		A a = new A();
		B t1 = new B(a,"Dhoni");
		B t2 = new B(a,"Yuvraj");
		
		t1.start();
		t2.start();
		
	}	
}
