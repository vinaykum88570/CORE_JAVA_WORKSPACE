package swappingNumber;

public class UsingThirdVariable {

	public static void main(String[] args) {
		
		// Swapping Without Using Third Variable 
		int a = 10;
		int b = 20;
		System.out.println("After Swapping:");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		a = a + b; // 10 + 20 = 30;
		b = a - b; // 30 - 20 = 10;
		a = a - b; // 30 - 10 = 20;
		
		System.out.println("\nBefore Swapping:");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
 		
		
	}

}
