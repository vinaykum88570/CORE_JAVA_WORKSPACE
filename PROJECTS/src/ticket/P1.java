package ticket;



class Display{
	
	public void display() {
		
		System.out.println("display");
	}
	
}

class Main{
	Display d;
	
	public Main(Display d) {
		this.d=d;
	}
	
	public void callDisplay() {
		d.display();
	}
	
}


public class P1 {

	public static void main(String[] args) {
		
		Display d = new Display();
		Main m = new Main(d);
		m.callDisplay();
	}
}		
