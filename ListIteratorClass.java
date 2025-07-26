import java.util.*;

// How to iterate through List, Set and Map.

public class ListIteratorClass {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(3);

    // Method 1: Using for-each loop
    // for (var el: arr) {
    //   System.out.print(el + " ");
    // }

    // Method 2: Using ListIterator
    Iterator<Integer> it = arr.iterator();
    while(it.hasNext()) {
      Integer el = it.next();
      System.out.println(el + " ");
    }

    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);

    it = set.iterator();
    while(it.hasNext()) {
      Integer el = it.next();
      System.out.println(el + " ");
    }
  }
}