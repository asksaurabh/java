import java.util.*;

/*
 * Unique elements
 * Any order
 * Uses Hash table internally
 */

public class HashSetClass {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    set.add(10);
    set.add(20);
    set.add(10);
    set.add(30);
    System.out.println("HashSet after adding elements: " + set);

    set.remove(20);
    System.out.println("HashSet after removing an element: " + set);

    set.remove(50);
    System.out.println("HashSet after trying to remove a non-existent element: " + set);

    System.out.println("Isempty? " + set.isEmpty());
    System.out.println("contains? " + set.contains(10));

    for (var el: set) {
      System.out.println(el);
    }
  }
}