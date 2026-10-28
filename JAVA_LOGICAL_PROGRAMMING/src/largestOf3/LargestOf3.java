package largestOf3;

public class LargestOf3 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	
	if(a>b && a>c) {
		System.out.println("A is Greatest :"+a);
		
	}else if(b>a && b>c){
		System.out.println("B is Greatest :"+b);
		
	}else {
		System.out.println("C is Greatest :"+c);
	}
}
}
