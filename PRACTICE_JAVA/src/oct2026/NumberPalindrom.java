package oct2026;

public class NumberPalindrom {

	public static void main(String[] args) {
		// Reverse this number if reverse is same - org_num so its [palindrom number]
				int num = 14641;
				int org=num;
				int rev=0;
				
				while(num!=0) {
					rev=rev*10+num%10;
					num=num/10;
				}
				
				if(org==rev){
					System.out.println("Palindrom number");
				}else {
					System.out.println("not palindrom number");
				}
				
	}
}
