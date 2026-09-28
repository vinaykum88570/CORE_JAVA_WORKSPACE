package B_Methods;
//2] Method with arguments and without return values.
//use Empty data type void

public class M2 {
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		new M2().add(10, 20);
		
		M2 obj = new M2();
		obj.add(2, 20);
		
	}

}
	