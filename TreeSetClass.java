import java.util.*;

public class TreeSetClass {
  public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<>();

    ts.add(30);
    ts.add(1);
    ts.add(13);
    ts.add(4);

    for (var i : ts) {
      System.out.print(i + " ");
    }

    // Important methods
    System.out.println("\nfirst: " + ts.first());
    System.out.println("last: " + ts.last());

    System.out.println("floor: " + ts.floor(15));
    System.out.println("floor: " + ts.floor(0));

    System.out.println("ceiling(31) is null: " + (ts.ceiling(31) == null));
  }
}