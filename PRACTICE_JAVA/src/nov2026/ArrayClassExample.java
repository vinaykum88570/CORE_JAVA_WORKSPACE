package nov2026;

import java.util.Arrays;

public class ArrayClassExample {
    public static void main(String[] args) {
        int [] a={10,50,30,40,20};
     String s = Arrays.toString(a);
       System.out.println(s);
       Arrays.sort(a);
       String s1 = Arrays.toString(a);
       System.out.println(s1);
    }
}
