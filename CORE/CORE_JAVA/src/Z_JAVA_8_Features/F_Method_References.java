package Z_JAVA_8_Features;

// Method References
//--------------------------------------------------------------------------------------------------
 
// To create a references to a instance methods

interface Dis {
	
	void show ();
	
}
public class F_Method_References {
	
	void display(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		F_Method_References m = new F_Method_References();
		
		Dis d = m::display;  // Here Display() method refered by show() 
		                    
	}
}
