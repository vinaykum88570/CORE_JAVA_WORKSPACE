package nov2026;

import java.util.*;

public class CollectionClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(83);
        al.add(45);
        al.add(44);
        al.add(81);
        al.add(74);
        System.out.println(al);
        Collections.sort(al);   
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
