import java.util.*;

class CommonAlgorithms {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
    System.out.println(list);

    // Sorting the list
    Collections.sort(list);
    System.out.println(list);

    // Max and Min
    Integer max = Collections.max(list);
    Integer min = Collections.min(list);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);

    // Reverse
    Collections.reverse(list);
    System.out.println(list);

    // Sort an array
    Integer[] array = {8, 5, 3, 2, 1};
    Arrays.sort(array);

    // System.out.println(array);
    System.out.println(Arrays.toString(array));

    // Frequency of elements
    list.add(1);
    Integer count = Collections.frequency(list, 1);
    System.out.println("Count: " + count);

    // Math operations
    int power = (int) Math.pow(2, 3); // 2^3
    System.out.println("Power: " + power);
  }
}