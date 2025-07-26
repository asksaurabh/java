import java.util.*;

// How comparator works
// — A negative integer if the first argument is less than the second.
// — Zero if the first argument is equal to the second.
// — A positive integer if the first argument is greater than the second.

// returning a positive integer reverse the order of elements.

public class CustomComparatorClass {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

    System.out.println("unsorted numbers: " + numbers);

    Collections.sort(numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        if (a < b) {
          return 1;
        } else if (a > b) {
          return -1;
        } else {
          return 0;
        }
      }
    });
    System.out.println("Sorted numbers in des order: " + numbers);

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        if (a.length() < b.length()) {
          return -1;
        } else if (a.length() > b.length()) {
          return 1;
        } else {
          return 0;
        }
      }
    });

    // Ascending order of names.
    System.out.println(names);

    // Lambdas.
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));

    Collections.sort(nums, (a, b) -> b - a);
    System.out.println(nums);
  }
}