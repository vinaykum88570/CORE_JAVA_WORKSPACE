package printArray;

public class FindLargestElement {

	public static void main(String[] args) {
		
		   int[] arr = {60, 25, 7, 40, 15};
		   
		   int largest = arr[0]; // 30
		   
		   for(int i=1; i < arr.length; i++) {
			   
			   // 25 > 30
			   // 7 > 30
			   // 40 > 30
			   // 15 > 40
			   if(arr[i] > largest) {
				   largest=arr[i];
				   
			   }
		
		   }
		System.out.println("Largest = " + largest);	   
	}
}
