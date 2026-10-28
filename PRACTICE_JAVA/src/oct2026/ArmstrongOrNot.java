package oct2026;

public class ArmstrongOrNot {

	public static void main(String[] args) {
	
		int n=153;
		int p=n;
		int d;
		int sum =0;
		
		while(p>0) {
			d=p%10; 
		    sum=sum+d*d*d;
		    p=p/10;
		}
		if(sum==n){
            System.out.println("NUMBER IS ARMSTRONG");
        }
        else{
            System.out.println("NUMBER IS NOT ARMSTRONG");
        }
		
		
		
	}
}
