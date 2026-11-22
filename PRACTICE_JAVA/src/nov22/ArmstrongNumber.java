package nov22;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int p=num;
		int d;
		int sum=0;
		
		while(p>0) {
			d=p%10;
			sum=sum+d*d*d;
			p=p/10;
		}
		
		if(sum==num) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is Not Armstrong");
		}
	}
}
