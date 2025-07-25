class Person {
  int age;
  String name;

  public Person() {
    this.age = 1;
    this.name = "John Doe";
  }

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void printAge() {
    System.out.println("Age is: " + age);
  }

  public int getSum(int a, int b) {
    return a + b;
  }
}

public class ClassBasics {
  public static void main(String[] args) {
    Person p = new Person();
    p.age = 25;
    p.printAge();

    Person p2 = new Person();
    p2.setAge(30);
    p2.printAge();

    Person p3 = new Person();
    p3.printAge();
    System.out.println(p3.getSum(1, 2));

    Person p4 = new Person(3, "Saurabh Kumar");
    p4.printAge();
    System.out.println(p4.name);
  }
}