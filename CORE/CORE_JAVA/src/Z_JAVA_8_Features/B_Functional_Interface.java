package Z_JAVA_8_Features;

// If an interface contain only one abstract method , such type of interfaces are called Functional Interfaces. 

@FunctionalInterface
interface Test{
	void show();     // It is a Functional Interface because it contains only one
	                 // abstract methods(show() methods).
}
@FunctionalInterface
interface West extends Test{
	// void Display();           // It is a Functional Interface because it contains two methods
                                 // (show() and display() methods)
                                 // show() derive from Test interface.
}

public class B_Functional_Interface {

	
}
