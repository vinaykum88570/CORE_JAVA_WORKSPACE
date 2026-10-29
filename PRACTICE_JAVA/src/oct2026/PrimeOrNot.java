package oct2026;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 2;
		int count = 0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not prime Number");
			}
		}else {
			System.out.println("Not Prime Number");
		}
	}
}
