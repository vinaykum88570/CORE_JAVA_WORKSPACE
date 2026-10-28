package oct2026;

public class LargestOf3 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=10;
		
		if(a> b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else if(c>a && c>b) {
			System.out.println(c);
		}
	}
}
