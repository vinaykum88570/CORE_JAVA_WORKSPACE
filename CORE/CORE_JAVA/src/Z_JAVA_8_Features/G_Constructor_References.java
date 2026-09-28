package Z_JAVA_8_Features;

// Constructor References 
//---------------------------------------------------------------------------------------------

//To create a reference to a constructor.

@FunctionalInterface
interface T{
	void show();
	
}
class D{
	
	public D() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		T t = D::new;
	}
}



public class G_Constructor_References {

	public static void main(String[] args) {
		
	}
}
