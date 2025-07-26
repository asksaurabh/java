import java.util.*;

public class TreeMapClass {
  public static void main(String[] args) {
    TreeMap<Integer, String> map = new TreeMap<>();

    map.put(5, "Five");
    map.put(1, "One");
    map.put(3, "Three");

    System.out.println("firstKey: " + map.firstKey());
    System.out.println("lastKey: " + map.lastKey());
    System.out.println("ceilingKey(2): " + map.ceilingKey(2));
    System.out.println("floorKey(2): " + map.floorKey(2));

    Set<Integer> keys = map.keySet();

    for (Integer key : keys) {
      System.out.print(key + " " + map.get(key) + ", ");
    }
  }
}