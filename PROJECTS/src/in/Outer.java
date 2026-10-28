package in;

//public class Outer {
//
//	static class Inner{
//		void display() {
//			System.out.println(" Static member display Methods ");
//		}
//	}
//	public static void main(String[] args) {
//		
//		Outer.Inner i = new Outer.Inner();
//	}
//}



//public class Outer {
//
//	class Inner{
//		void display() {
//			System.out.println(" Member display Methods ");
//		}
//	}
//	public static void main(String[] args) {
//		Outer o = new Outer();
//		Outer.Inner i = o.new Inner();
//		i.display();
//	}
//}

// Local class 
//public class Outer{
//	public static void main(String[] args) {
//
//		class Test {
//			public void display() {
//				System.out.println("display methods:");
//			}
//	}
//		Test t = new Test();
//		t.display();
//}
//}

// Anonymous inner classes
interface Test{
	void show();
	
}
public class Outer{
	public static void main(String[] args) {
		
		Test t = new Test() {
			public void show() {
				System.out.println("display methods");
			}
		};
		t.show();
	}
}



