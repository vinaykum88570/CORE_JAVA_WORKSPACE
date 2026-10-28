package binaryToDecimal;

public class BinaryToDecimal {
  public static void main(String[] args) {
	int n;
	int d;
	double sum=0;
	int p=0;
	
	n=10;
	while(n>0) {
		d=n%10;
		sum=sum+d*Math.pow(2, p);
		n=n/10;
		p=p+1;
		
	}
	System.out.println(sum);
}
}
