package printArray;

import java.util.Arrays;

public class LargestElement {

	
	public static void main(String[] args) {
		
		//Second smallest Number
		int [] arr = {5, 2, 8, 3, 1};
		
		int largest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] > largest) {  // 2>5
			  largest=arr[i];                   // 8>5
			}
			
		}
		
		System.out.println("Largest ="+largest);
	}
}
