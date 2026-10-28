package oct2026;

public class FindLargestElement {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 4, 5, 2, 7, 5};
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		System.out.println("largest ="+largest);
	}
}
