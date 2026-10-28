package printArray;

public class SearchElement {

	public static void main(String[] args) {
		
		// Search Element
		int[] arr = {10, 20, 30, 40, 50};
		
		int searchElement = 10;
		
		boolean found = false;
		
		for(int i = 0;i< arr.length; i++ ) {
			
			if(arr[i]==searchElement) {
				found = true;
			    break;
			}

		}
		
		if(found) {
			System.out.println(" Found Element = "+ searchElement);
		}
		else {
			System.out.println(" Not Found ");
		}
	}
}
