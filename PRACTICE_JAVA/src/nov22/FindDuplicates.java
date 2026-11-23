package nov22;

public class FindDuplicates {

	public static void main(String[] args) {
		 int[] arr = {15, 20, 7, 10, 11, 13, 11};
		 
		 for(int i=1;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]==arr[j]) {
					 System.out.println("Duplicates Found "+arr[i]);
				 }
			 }
		 }
		
     }
}


