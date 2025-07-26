import java.util.*;

// Idea is to use deque as a queue here.
// As deque is a double-ended queue, we can add and remove elements to both ends.

// To implement a stack using deque, use offerFirst(),pollFirst() and peekFirst() methods.

public class ArrayDequeClass {
  public static void main(String[] args) {
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    deque.offer(10);
    deque.offer(30);
    deque.offer(20);
    deque.offer(20);
    System.out.println("Deque after adding elements: " + deque);
    
    System.out.println("First element: " + deque.peek());

    deque.poll();
    System.out.println("Deque after removing first element: " + deque);
  }
}