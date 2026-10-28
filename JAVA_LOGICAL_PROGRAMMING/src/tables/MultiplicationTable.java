package tables;

import java.util.Scanner;

public class MultiplicationTable {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number:");
		int num = scanner.nextInt();
		
		// Multiplication table of the given Input number
		for(int i=1; i<=10;i++) {
			System.out.println(num+"x"+i+"="+(i*num));
		}
		
		scanner.close();
	}

}
