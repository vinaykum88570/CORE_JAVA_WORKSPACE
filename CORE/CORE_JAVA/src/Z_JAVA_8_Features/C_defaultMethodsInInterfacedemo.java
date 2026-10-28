package Z_JAVA_8_Features;

// To Write concreate methods in interface by prefixing default keyword.

interface Demo{
	
	default void show() {
		System.out.println("Welcome");
	}
}

class Interface implements Demo{
	public static void main(String[] args) {
		Interface i = new Interface();
		i.show();
	}
	
}

public class C_defaultMethodsInInterfacedemo{

	public static void main(String[] args) {
		
	}
	
}
