package oct2026;

public class FibonncySeries {

	public static void main(String[] args) {
		int n=13;
		
		int f;
		int f1=0;
		int f2=1;
		
		for(int i=1;i<=n;i++) {
			f=f1+f2;// 1
			System.out.println(f);
			f1=f2;
			f2=f;
		}
		
	}
}
