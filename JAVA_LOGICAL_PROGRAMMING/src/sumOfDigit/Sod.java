package sumOfDigit;

import java.util.Scanner;

public class Sod {
 public static void main(String[] args) {
	
	int number = 143;
	int digit;
	int sum = 0;
	
	while (number>0) {
	
		digit = number % 10;
		sum = sum + digit;// 3
		number = number / 10; // 43
		
		
	}
	
	
}
}
