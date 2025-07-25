interface Animal {
  void sound();

  default void sleep() {
    System.out.println("I'm sleeping");
  }

  static void info() {
    System.out.println("Animals are living beings.");
  }
}

interface Pet {
  void getOwner();
}

class Dog implements Animal, Pet {
  public void sound() {
    System.out.println("Woof Woof");
  }
  public void getOwner() {
    System.out.println("The owner of this dog is John.");
  }
}

public class Interfaces {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound();
    dog.sleep();
    dog.getOwner();

    Animal.info();
  }
}