package C_StaticMethod;

public class Demo {
	static int x=10;
	static void display() {
		
		System.out.println(x); 
	}
    static{
		System.out.println("Static block:");
	}
    Demo(){
    	System.out.println("Constructor:");
    }
    
    {
		System.out.println(" InstantBlock block :");
	}
    // static block ->
   
	
public static void main(String[] args) {
	
	Demo d = new Demo();
	Demo.display();
	
	

	
	
}
}
