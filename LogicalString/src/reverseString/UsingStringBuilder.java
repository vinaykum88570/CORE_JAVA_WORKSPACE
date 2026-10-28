package reverseString;

import java.util.Scanner;

public class UsingStringBuilder {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		String str = sc.next();
		   
		StringBuilder sbl = new StringBuilder(str);
		StringBuilder reverse = sbl.reverse();
		System.out.println(reverse);
	}
}
