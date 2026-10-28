package oct2026;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int n=370; // 153,370,371,407
		int p=n;
		int d;
		int sum=0;
		
		
		while(p>0) {
			d=p%10;
			sum=sum+d*d*d;
			p=p/10;
		}
		
		if(n==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}
