package nov2026;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(101);
        pq.offer(102);
        pq.offer(103);
        pq.poll();
        pq.poll();
        System.out.println(pq);
    }
}
