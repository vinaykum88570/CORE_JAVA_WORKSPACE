package oct2026;

public class MoveNegativeNumbers {

	public static void main(String[] args) {
		int [] arr = {-1,-20,-30,40,50,-8};
		int [] result= new int[arr.length];
		
		int index=0;
		
		
		// Add Negative Numbers
				for(int i=0;i<arr.length;i++) {
					if(arr[i]<0) {
						result[index]=arr[i];
						index++;
					}
				}
				
		// Add Positive Numbers
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
