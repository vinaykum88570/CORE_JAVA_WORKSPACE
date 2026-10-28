package ticket;


class A{
	public synchronized void displayn() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			}
		}
	}
	}
class B{
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
class Demo1 extends Thread{
	A a;
	Demo1(A a){
		this.a=a;
	}
	public void run() {
		a.displayn();
	}
			
}
class Demo2 extends Thread{
	B b;
	Demo2(B b){
		this.b=b;
	}
	public void run() {
		b.displayc();
	}
			
}
public class My {
   public static void main(String[] args) {
	A a = new A();
	B b = new B();
	
	Demo1 t1 = new Demo1(a);
	Demo2 t2 = new Demo2(b);
	t1.start();
	t2.start();
	
}
}
