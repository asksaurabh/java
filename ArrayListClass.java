import java.util.*;

class ArrayListClass {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    arr.add(10);
    arr.add(20);
    System.out.println("ArrayList: " + arr);

    arr.add(1, 30);
    System.out.println("After adding 30 at index 1: " + arr);

    // Demonstrating the use of List methods
    System.out.println("Element at index 0: " + arr.get(0));
    System.out.println("Size of ArrayList: " + arr.size());
    System.out.println("Is ArrayList empty? " + arr.isEmpty());

    System.out.println("Removing element at index 1: " + arr.remove(1));
    System.out.println("ArrayList after removal: " + arr);

    System.out.println("contains: " + arr.contains(10));
  }
}