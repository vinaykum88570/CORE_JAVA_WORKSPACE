package printArray;

public class SomeOfArray {
 
	public static void main(String[] args) {
		 
		// Sum Of Array
		int[] arr = {10, 20, 30, 40, 50};
		int sum=0;
		
		for(int newArr:arr) {
			sum=sum+newArr;
			
		}
		System.out.println(sum);
	}
}
