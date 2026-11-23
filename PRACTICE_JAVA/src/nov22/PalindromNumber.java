package nov22;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=12321;
		int org_num=num;
		int rev =0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(org_num==rev) {
			System.out.println("Palindrom Number");
		}else {
			System.out.println("Not Palindrom Number");
		}
	}

}
