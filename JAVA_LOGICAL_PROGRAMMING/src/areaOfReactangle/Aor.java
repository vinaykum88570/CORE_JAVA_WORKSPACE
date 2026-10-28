package areaOfReactangle;

import java.util.Scanner;

public class Aor {
	public static void main(String[] args) {
        int A,L,W;
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF LENGTH:");
        L=sc.nextInt();
        System.out.print("ENTER THE VALUE OF WIDTH:");
        W=sc.nextInt();

        A=L*W;

        System.out.print("AREA OF REACTANGLE :");
        System.out.println(A);
    }
}
