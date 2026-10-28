package reverseNumber;

public class ReverseNumber {
public static void main(String[] args) {
	int n=1400;
	int d;
	
	while(n>0) {
		d = n % 10;
		System.out.print(d);
		n = n / 10;
	}
	}
}
