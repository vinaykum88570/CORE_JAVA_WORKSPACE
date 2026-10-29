package printArray;

public class SeconsLargestElement {

	public static void main(String[] args) {
		
		int []arr= {12,35,1,10,34,1};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > largest) {
				secondLargest=largest;
				largest = num;
			}
			else if(num > secondLargest && num != largest){
				secondLargest = num;
			}
		}
		System.out.println("SecondLargest ="+secondLargest);
	}
}
