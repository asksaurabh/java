import java.util.Scanner;

public class Conditionals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String grade = scanner.next();

    if (grade.equals("A")) {
      System.out.println("Excellent!");
    } else if (grade.equals("B")) {
      System.out.println("Good job!");
    } else if (grade.equals("C")) {
      System.out.println("You can do better.");
    } else if (grade.equals("D")) {
      System.out.println("You need to work harder.");
    } else {
      System.out.println("Invalid grade.");
    }

    int dayNumber = scanner.nextInt();

    switch (dayNumber) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      default:
        System.out.println("Holiday");
        break;
    }

    scanner.close();
  }
}