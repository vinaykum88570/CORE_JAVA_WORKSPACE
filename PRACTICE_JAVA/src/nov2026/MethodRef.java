package nov2026;

interface Test{
	void show();
}
public class MethodRef {

	public void m1() {
		System.out.println("Methods Ref");
	}
	public static void main(String[] args) {
		MethodRef m = new MethodRef();
		Test t = m::m1;
		t.show();
	}
}
