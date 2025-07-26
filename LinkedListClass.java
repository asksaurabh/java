import java.util.*;

// class Data {
//   Integer age;
//   String name;

//   Data(Integer age, String name) {
//     this.age = age;
//     this.name = name;
//   }
// }

public class LinkedListClass {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(20);
    list.add(30);
    list.addFirst(10);

    System.out.println("LinkedList: " + list);

    list.removeFirst();
    System.out.println("After removing first element: " + list);

    list.remove();
    System.out.println("After removing first element again: " + list);

    list.addFirst(40);

    Integer firstElement = list.getFirst();
    System.out.println("First element: " + firstElement);

    Integer lastElement = list.getLast();
    System.out.println("Last element: " + lastElement);
  }
}