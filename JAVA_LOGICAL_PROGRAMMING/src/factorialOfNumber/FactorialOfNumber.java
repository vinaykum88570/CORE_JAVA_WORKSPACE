package factorialOfNumber;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int n=4;
		int i;
		int f=1;
		
		if(n==0 || n==1) {
			System.out.println(f);
		}
		else {
			for(i=1;i<=n;i++) {
				f=f*i;
			}
			System.out.println(f);
		}
	}
	
	
	
}
