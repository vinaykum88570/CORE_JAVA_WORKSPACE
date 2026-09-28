package reverseString;

public class ReverseString {
	public static void main(String[] args) {
	String str ="kumdale vinay ";
	int n = str.length();
	
	for(int i=n-1;i>=0;i--) {
		System.out.print(str.charAt(i));
		System.out.println("");
	}
		
	}
}
