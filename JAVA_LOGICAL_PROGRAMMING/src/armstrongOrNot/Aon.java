package armstrongOrNot;

import java.util.Scanner;

public class Aon {
	public static void main(String[] args) {
        int n,d,sum=0,p;
        n=153;
        p=n;
      
        while (p>0) {
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
