public class WrapperClasses {
  public static void main(String[] args) {
    Integer age = 25;
    Integer age2 = 25;

    System.out.println("age == age2: " + (age == age2));           // true (cached)
    System.out.println("age.equals(age2): " + age.equals(age2));   // true (value comparison)

    Integer a = 1000;
    Integer b = 1000;
    System.out.println("a == b: " + (a == b));                     // false (different objects)
    System.out.println("a.equals(b): " + a.equals(b));             // true (value comparison)
    
    // Demonstrating the caching boundary
    Integer cached1 = 127;
    Integer cached2 = 127;
    Integer notCached1 = 128;
    Integer notCached2 = 128;
    
    System.out.println("127 == 127: " + (cached1 == cached2));         // true (cached)
    System.out.println("128 == 128: " + (notCached1 == notCached2));   // false (not cached)
  }
}