package oct2;


interface MethodRef{
	void show();
	
}

public class MethodReferanceExample {

	public MethodReferanceExample() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		MethodRef test = MethodReferanceExample::new;
		test.show();
	}
}
