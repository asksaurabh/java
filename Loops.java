public class Loops {
  public static void main(String[] args) {
    int j = 0;

    while(j < 5) {
      System.out.println("While loop iteration: " + j);
      j++;
    }

    int i = 5;
    do {
      System.out.println("Do-while loop iteration: " + i);
      i++;
    } while(i < 5);

    try {
      int num = 10 / 0;
      System.out.println("This will not print due to division by zero.");
    } catch (Exception e) {
      System.out.println("An error occurred: " + e);
      System.out.println("Error message: " + e.getMessage());
    }
  }
}