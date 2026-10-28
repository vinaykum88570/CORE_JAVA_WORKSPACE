package B_Methods;

public class M22 {
	
	void addElement(int[] a) {
		int total =0;
		for(int b : a) {
		total = total + b;
		}
		System.out.println(total);
	}
public static void main(String[] args) {
	new M22().addElement(new int[] {1,2,3,4,5});
	
	
	int []x={1,2,3,4,5,6,7,8,9,10};
	M22 m = new M22();
	m.addElement(x);
	
}
}
