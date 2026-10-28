package oct2026;

public class EvenOrOdd {
	public static void main(String[] args) {
		// Count Even or Odd
		int[] arr = {10, 15, 20, 7, 8, 11};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even ="+arr[i]);
			}else {
				System.out.println("Odd ="+arr[i]);
			}
		}
		
	}
}
