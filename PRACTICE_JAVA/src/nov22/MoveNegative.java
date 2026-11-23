package nov22;

public class MoveNegative {
	public static void main(String[] args) {
		int [] arr = {-1,-20,-30,40,50,-8};
		
		int [] result=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				result[index]=arr[i];
				index++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0) {
				result[index]=arr[i];
				index++;
			}
		}
		
		// Print result
				for(int i=0; i<result.length;i++) {
					System.out.print(result[i]+" ");
				}
	}
}
