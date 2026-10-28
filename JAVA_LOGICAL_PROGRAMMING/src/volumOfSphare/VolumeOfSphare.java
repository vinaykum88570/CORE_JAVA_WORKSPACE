package volumOfSphare;

import java.util.Scanner;

public class VolumeOfSphare {
	 public static void main(String[] args) {
	        float pi=3.14f;
	        float r,v;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("ENTER THE VALUE OF R:");
	        r=sc.nextInt();

	        v=3.140f*pi*r*r*r;
	        System.out.print("VOlume of Sphare is:"+v);
	        
	    }
}
