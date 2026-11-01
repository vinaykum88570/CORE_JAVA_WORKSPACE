package nov2026;

import java.util.Iterator;

public class CountEvenOrODD {

	public static void main(String[] args) {
		
		 int[] arr = {10, 15, 20, 7, 8, 11};
		 
		 for (int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println("odd ="+arr[i]);
			}
//			else {
//				System.out.println("Odd ="+ arr[i]);
//			}
		}
	}
}
