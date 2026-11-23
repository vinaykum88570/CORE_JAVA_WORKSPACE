package nov22;

public class CountNumberOccured {

	public static void main(String[] args) {
		 int[] arr = {10, 15, 20, 7, 10, 11, 13, 10};

		 int count=0;
		 int num=10;
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]==num) {
				 count++;
			 }
		 }
		 
		 System.out.println("Count Of "+num+" Occurance "+count);
     }
}


