package tempConversion;

import java.util.Scanner;

public class TempConversion {
	 public static void main(String[] args) {
	        double f;
	        int c;
	        Scanner sc= new Scanner(System.in);
	        System.out.print("ENTER THE VELUE OF C:");
	        c=sc.nextInt();

	        f=1.8*c+32;
	        System.out.println(f);

	    }
}
