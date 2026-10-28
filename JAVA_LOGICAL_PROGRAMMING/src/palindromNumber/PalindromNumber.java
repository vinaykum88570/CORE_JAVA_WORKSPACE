package palindromNumber;

public class PalindromNumber {

	public static void main(String[] args) {
		
		
		// Reverse this number if reverse is same - org_num so its [palindrom number
		int num = 14641;
		
		int org_num = num;
		
		int rev=0;
		while(num!=0) {
			 	rev=rev*10+ num%10;
			 	num=num/10;
			 
		}

		if(org_num==rev) {
			System.out.println(org_num +"   "+ rev+"Palindrom number");
		}else {
			System.out.println("not palindrom number");
		}
		
	}
}
