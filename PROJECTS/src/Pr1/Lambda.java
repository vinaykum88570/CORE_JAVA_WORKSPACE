package Pr1;


interface Todo{
	 void show();
	 
	
}

public class Lambda {

	void display() {
		System.out.println("Hello World");
	}
	
	public Lambda() {
		System.out.println("Constructor Referance");
	}
	
	public static void main(String[] args) {
		
		Todo t = Lambda::new;
		t.show();
		
		
	
		
		
		
	}
}
