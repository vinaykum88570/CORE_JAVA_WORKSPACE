package P_InnerClasses;

// Interface
interface Test{
	
	void show();
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		// Anonymous inner Class
		Test t = new Test() 
		{
			public void show() {
				System.out.println("Hello");
			}
		};
		t.show();
	}
}
