package printArray;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {40, 10, 50, 20, 30};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					int temp=arr[i]; // store current value
					arr[i]=arr[j]; // Replace with smaller value
					arr[j]=temp;   // Put old value in its position
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
