package nov2026;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		 int[] arr = {60, 25, 7, 40, 15};
		 
		 int largest=arr[0];
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>largest) {
				 largest=arr[i];
				 
			 }
		 }
		 
		 System.out.println(largest);
		
	}
}
