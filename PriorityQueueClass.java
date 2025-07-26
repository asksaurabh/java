import java.util.*;

// Min heap 
// Whenever you peek, it will return the smallest element
// If you poll, it will remove the smallest element
// If you offer, it will add the element to the heap

public class PriorityQueueClass {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.offer(1);
    pq.offer(0);
    pq.offer(3);
    pq.offer(2);
    System.out.println("peek: " + pq.peek());

    pq.poll();
    System.out.println("peek: " + pq.peek());

    while(pq.isEmpty() == false) {
      System.out.println(pq.peek());
      pq.poll();
    }
  } 
}