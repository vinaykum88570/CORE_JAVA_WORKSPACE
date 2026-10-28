package reverseString;

import java.util.Scanner;

public class UsingStringBuffer {
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Number:");
	   int num = sc.nextInt();
	
	   StringBuffer sb = new StringBuffer(String.valueOf(num));
	   StringBuffer rev = sb.reverse();
	   System.out.println("Reverse Number is = "+rev);
}
}
