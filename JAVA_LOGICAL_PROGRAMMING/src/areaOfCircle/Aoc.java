package areaOfCircle;

import java.util.Scanner;

public class Aoc {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        float Area;
        float r;
        
       float  pi=3.14f;


        System.out.println("ENTER THE VALUE OF r:");
          r = sc.nextFloat();

        Area=pi*r*r;
        
        System.out.println("Area "+ Area);

    }
}
