package nov2026;

public class FindDuplicate2 {

	public static void main(String[] args) {
		int[] arr = {4, 2, 4, 5, 2, 7, 5, 5,9,3};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.println("Duplicates ="+arr[i]);
				}
			}
		}
	}
}
