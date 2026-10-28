package oct2026;

import java.util.ArrayList;

public class FibbonancySeries {

	public static void main(String[] args) {
		int n=7;
		int f;
		int f1=0;
		int f2=1;
		
		
		for(int i=3;i<=n;i++) {
	    f=f1+f2;
	    System.out.println(f);//f=1
	    f1=f2;
	    f2=f;
		}
		
		
		
	}
}
