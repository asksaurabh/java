import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    byte num = 127;
    short shortNum = 32767;
    int intNum = 100;
    float floatNum = 3.14f;
    char ch = 'A';
    String str = "Hello, World!";
    boolean isTrue = true;

    System.out.println("The value of num is: " + num);
    System.out.println("The value of shortNum is: " + shortNum);
    System.out.println("The value of intNum is: " + intNum);
    System.out.println("The value of floatNum is: " + floatNum);
    System.out.println("The character is: " + ch);
    System.out.println("The string is: " + str);
    System.out.println("The boolean value is: " + isTrue);

    int divi = 10 / 3;
    System.out.println("integer division 10 / 3 is: " + divi);

    double d = 10 / (double)3;
    System.out.println("double division 10.0 / 3.0 is: " + d);

    boolean i = !true;
    System.out.println("boolean i is: " + i);

    String userName = "Saurabh Kumar";
    
    System.out.println(userName + " has length: " + userName.length());
    System.out.println("index: " + userName.charAt(0));
    System.out.println("substring: " + userName.substring(0, 5));
    System.out.println("uppercase: " + userName.toUpperCase());
    System.out.println("lowercase: " + userName.toLowerCase());
    System.out.println("contains: " + userName.contains("Saurabh"));
    System.out.println("starts with: " + userName.startsWith("Saurabh"));
    System.out.println("is empty: " + userName.isEmpty());
    System.out.println("equals: " + userName.equals("Saurabh Kumar"));

    // Demonstrating string immutability
    // System.out.println("userName reference before: " + System.identityHashCode(userName));
    
    // userName += " Singh"; // This creates a NEW string object
    // System.out.println("userName reference after: " + System.identityHashCode(userName));

    String test = "beech test beech";
    System.out.println("replaced string: " + test.replace("beech", "test"));

    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    String first = scanner.next();
    String last = scanner.nextLine();

    System.out.println("You entered number: " + inputNumber);
    System.out.println("You entered string: " + first);
    System.out.println("You entered string: " + last);
    scanner.close();

    // Type conversion
    double doubleValue = 10.5;
    int intValue = (int) doubleValue;
    System.out.println("Converted double to int: " + intValue);

    final int MAX_VALUE = 1000;
    System.out.println("The maximum value is: " + MAX_VALUE);

    // Arrays
    int[] numbers = {1, 2, 3, 4, 5};

    for (int k = 0; k < numbers.length; k++) {
      System.out.println("Element at index " + k + ": " + numbers[k]);
    }

    // 2D arrays
    int [][] matrix = new int[3][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;

    for (int m = 0; m < matrix[0].length; m++) {
      for (int n = 0; n < matrix.length; n++) {
        System.out.print(matrix[m][n] + " ");
      }
      System.out.println();
    }
  }
}