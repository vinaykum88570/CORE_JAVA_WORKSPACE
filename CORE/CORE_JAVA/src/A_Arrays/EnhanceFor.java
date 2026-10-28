package A_Arrays;
//Enhance for loop:
public class EnhanceFor {
	
 public static void main(String[] args) {
	int[] a= new int[]{1,2,3,4,5,6,7,8,9,10};
	int total=0;
	for(int c : a) {
		total = total+c;
	}
	System.out.println(total);
	
}
}
