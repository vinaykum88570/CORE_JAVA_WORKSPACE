package oct2026;

public class PalindomeNumber {

	public static void main(String[] args) {
		int num = 12321;
		int rev=0;
		
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(rev==num) {
			System.out.println("Palindrom Number");
		}else {
			System.out.println("Palindrom Number");
		}
	}
}
