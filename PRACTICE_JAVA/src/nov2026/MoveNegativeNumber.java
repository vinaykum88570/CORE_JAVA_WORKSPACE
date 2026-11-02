package nov2026;

public class MoveNegativeNumber {

	public static void main(String[] args) {
		// Java Program to move all negative numbers to the start of array with positive numbers to end
				int [] arr = {-1,-20,-30,40,50,-8};
				int [] result= new int[arr.length];
				int index = 0;
				
				
				// Add Negative Numbers
				for(int i=0;i<arr.length;i++) {
					if(arr[i]<0) {
						result[index]=arr[i];
						index++;
					}
				}
				
				// Then Add Positeve Numbers At Start Position
				for(int i=0;i<arr.length;i++) {
					if(arr[i]>0) {
						result[index]=arr[i];
						index++;
					}
				}
				
				for (int i : result) {
					System.out.println(i);
				}
				
	}
}
