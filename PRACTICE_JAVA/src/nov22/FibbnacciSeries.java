package nov22;

public class FibbnacciSeries {

	public static void main(String[] args) {
		int n=13;
		
		int f;
		int f1=0;
		int f2=1;
		
		for(int i=3;i<=13;i++) {
			f=f1+f2;
			System.out.println(f);
			
			f1=f2;
			f2=f;
		}

	}

}
