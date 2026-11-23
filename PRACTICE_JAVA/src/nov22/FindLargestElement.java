package nov22;

public class FindLargestElement {

	public static void main(String[] args) {
		 int[] arr = {15, 20, 7, 10, 11, 73, 11};
		 
		 int largest = arr[0];
		 
		 for(int i=1;i<arr.length;i++) {
		
			 if(arr[i]>largest) {
				largest=arr[i];
			
			}
		 }
		 System.out.println("largest :>"+largest);
		
     }
}


