package nov2026;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExmaple {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(78);
        al.add(74);
        al.add(46);
        al.add(78);
        al.add(66);
        System.out.println(al);
        for(int x:al){
            System.out.println(x+5);
        }
       
        
    }
}
