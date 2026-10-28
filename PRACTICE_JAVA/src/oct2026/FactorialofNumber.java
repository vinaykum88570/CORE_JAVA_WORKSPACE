package oct2026;

public class FactorialofNumber {
public static void main(String[] args) {
	int n=6;
	int f=1;
	if(n==0 || n==1) {
		System.out.println(f);
	}
	else {
		for(int i=1;i<=n;i++) {
			f=f*i;
			
		}
		System.out.println(f);
	}
}
}
