package printArray;

public class MoveNegativeNumbers {

	public static void main(String[] args) {
		

	    // Java Program to move all negative numbers to the start of array and positive numbers to end
		int [] arr = {-1,-20,-30,40,50,-8};
		int [] result = new int[arr.length];
	     
		int index=0;
		
		// First add negative numbers
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < 0) {
				result[index]=arr[i];
				index++;
			}
		}
		
		// Add positive numbers
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= 0) {
			    result[index]=arr[i];
			    index++;
			}
		}
		
		// Print result
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}

		}
}
