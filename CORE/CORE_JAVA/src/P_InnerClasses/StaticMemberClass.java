package P_InnerClasses;

class B{
	
	static class C{
		void show() {
			System.out.println("show methods");
		}
	}
}
public class StaticMemberClass {

	public static void main(String[] args) {
		// Outer and Inner both Object Created
		B.C c = new B.C();
		
		// Method call
		new B.C().show();

	}
}
