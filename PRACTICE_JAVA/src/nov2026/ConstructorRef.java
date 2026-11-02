package nov2026;

interface Test1{
	void display();
}
public class ConstructorRef {

	public ConstructorRef() {
		System.out.println("This is Construcor");
	}
	public static void main(String[] args) {
		
		Test1 t =ConstructorRef::new;
		t.display();
	}
}
