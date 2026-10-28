package palindromStirng;

public class PalindromString {

	public static void main(String[] args) {
		
		String str = "MADAM";
		String org_str= str;
		
		String rev= "";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		
		if(org_str.equals(rev)) {
			System.out.println("Palindrom String ");
		}else {
			System.out.println("Not Palindrom String");
		}
	}
}
