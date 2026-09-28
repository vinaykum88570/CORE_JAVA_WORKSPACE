package E_Super;

class D{
	D(){
		System.out.println("D class");
	}
	D(int x){ 
		this();
		System.out.println(x);
	}
}
public class Demo extends D {
	Demo(){
		super();
		System.out.println("Demo class");
	}
	Demo(int y){// 5
		this();
		System.out.println(y);
	}
	public static void main(String[] args) {
      new Demo(5);
      
		
	}
}
