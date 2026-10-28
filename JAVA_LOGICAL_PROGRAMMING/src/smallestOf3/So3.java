package smallestOf3;

import java.util.Scanner;

public class So3 {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF A:");
        a=sc.nextInt();

        System.out.print("ENTER THE NUMBER OF B:");
        b=sc.nextInt();

        System.out.print("ENTER THE NUMBER OF C:");
        c=sc.nextInt();

        if (a < b && a < c ) {
            System.out.print("A NUMBER IS SMALLEST:"+a);
             }
        else if(b < a && b < c){
             System.out.print("B NUMBER IS SMALLEST:"+b);
            }
        else{
             System.out.print("C NUMBER IS SMALLEST:"+c);
            }
        
    }
}
