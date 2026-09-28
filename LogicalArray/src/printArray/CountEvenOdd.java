package printArray;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		  int[] arr = {10, 15, 20, 7, 8, 11};
		  
		  int even = 0;
		  int odd = 0;
		  
		  for(int i=0;i<arr.length;i++) {
			  	
			  if(arr[i] % 2 ==0) {
				  
				  System.out.println("Even = "+ arr[i]);
				  even++;
			  }
			  else {
				  System.out.println("odd = "+ arr[i]);
				  odd++;
			  }
		  }
		  
		  	}
}
