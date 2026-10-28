package swappingNumber;

public class Swap2Number {

	public static void main(String[] args) {
		//Using Third Variable 
		int a=10;
		int b=20;
		int temp;
		
		System.out.println("Before Swapping a="+a +" b="+b );
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping a="+a +" b="+b);
		
	}
}
