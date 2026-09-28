package printArray;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		        // Move Zeroes to end of the array;
				int [] arr = {10,0,0,20,40,50,60};
				
				int []result = new int[arr.length];
				
				int index=0;
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i]>0) {
						result[index]=arr[i];
						index++;
					}
				}
				
				for (int i : result) {
					System.out.print(i+" ");
				}
	}
}
