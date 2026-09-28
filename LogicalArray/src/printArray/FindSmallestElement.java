package printArray;

public class FindSmallestElement {

	public static void main(String[] args) {
		
		   int[] arr = {10, 25, 7, 40, 15};
		   
		   int smallest = arr[0];
		   
		   for(int i=1; i < arr.length;i++) {
			   
			   if(arr[i]<smallest) { // 25 < 10;
				   smallest=arr[i];  // 7 < 40
			   }
		   }
		   System.out.println("smallest = "+ smallest);
	}
}
