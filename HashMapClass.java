import java.util.*;

// Key value pair
// No order
// No duplicate key

public class HashMapClass {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    System.out.println("One: " + map.get("One"));

    map.remove("Two");
    System.out.println("Two: " + map.get("Two"));

    System.out.println("Map size: " + map.size());

    System.out.println("containsKey: " + map.containsKey("One"));

    // Iterating through the map - sorted iteration.
    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}