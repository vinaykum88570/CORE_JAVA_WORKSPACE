package nov2026;

public class SearchElement {

	public static void main(String[] args) {
		// Search Element
		int[] arr = {10, 20, 30, 40, 50};
		
		int search=60;
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println("found ="+search);
		}
		else {
			System.out.println("Not Found");
		}
	}
}
