package oct2026;

import java.util.Iterator;

public class ArrayEvenODD {

	public static void main(String[] args) {
		// count Even odd
		int[] arr = {10, 15, 20, 7, 8, 11};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
			
		}
	}
}
