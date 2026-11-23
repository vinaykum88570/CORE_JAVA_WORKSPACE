package nov22;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		 int[] arr = {10, 15, 20, 7, 8, 11, 13, 15};
		
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]%2==0) {
				 System.out.println("Even = "+ arr[i]);;
			 }
			 else {
				  System.out.println("odd = "+ arr[i]);
			 }
		 }
		 
	}

}
