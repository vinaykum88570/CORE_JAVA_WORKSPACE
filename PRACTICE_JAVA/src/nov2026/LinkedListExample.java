package nov2026;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(23);
        ll.add(43);
        ll.add(83);
        ll.add(56);
        ll.add(87);
        ll.add(83);
        ll.add(null);
        System.out.println(ll);
    }
}
