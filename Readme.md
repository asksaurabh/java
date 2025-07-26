## Creating a basic java program

### Step 1: Create a new file
Create a new file named `HelloWorld.java` in your project directory.

### Step 2: Write the Java code
Open `HelloWorld.java` in a text editor and add the following code:

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

Explanation:
- `public class HelloWorld`: This defines a public class named `HelloWorld`.
- `public static void main(String[] args)`: This is the main method where the program execution begins.
- `System.out.println("Hello, World!");`: This line prints "Hello, World!" to the console.

### Step 3: Compile the Java program
Open your terminal or command prompt, navigate to the directory where `HelloWorld.java` is located, and run the following command:
```bash
javac HelloWorld.java
```
This command compiles the Java source file and generates a bytecode file named `HelloWorld.class`.

### Step 4: Run the Java program
After compiling, you can run the program using the following command:
```bash
java HelloWorld
```
This command executes the `HelloWorld` class, and you should see the output:
```
Hello, World!
```

### What does public static void main(String[] args) mean?
- `public`: This keyword means that the method can be accessed from anywhere.
- `static`: This means that the method belongs to the class, not to instances of the class.
- `void`: This indicates that the method does not return any value.
- `String[] args`: This is an array of strings that can hold command-line arguments passed to the program when it is executed.
This is useful for passing parameters to your program at runtime.

### Why must the class name match the filename?
The class name must match the filename because the Java compiler uses the class name to identify the source file. When you compile a Java program, the compiler looks for a public class with the same name as the file. If they do not match, you will encounter a compilation error.

### How to output text to the console?
To output text to the console in Java, you use the `System.out.println()` method.
This method prints the specified text followed by a new line. If you want to print text without a new line, you can use `System.out.print()` instead.

### Data types in Java
Java has several built-in data types that you can use to store different kinds of values. Here are some of the most commonly used data types:

- byte: Represents an 8-bit signed integer, with a range from -128 to 127 i.e. 2^7 - 1.
- short: Represents a 16-bit signed integer, with a range from -32,768 to 32,767 i.e. 2^15 - 1.
- int: Represents a 32-bit signed integer, with a range from -2,147,483,648 to 2,147,483,647 i.e. 2^31 - 1.
- long: Represents a 64-bit signed integer, with a range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 i.e. 2^63 - 1.
- float: Represents a single-precision 32-bit IEEE 754 floating point.
- double: Represents a double-precision 64-bit IEEE 754 floating point.
- char: Represents a single 16-bit Unicode character.
- boolean: Represents a value that can be either true or false.
- String: Represents a sequence of characters (not a primitive type, but widely used).

### How do you store float and double values?
In Java, you can store float and double values using the `float` and `double` data types, respectively. Here’s how you can declare and initialize them:
```java
float floatNum = 3.14f; // 'f' suffix indicates a float literal
double doubleNum = 3.14159; // No suffix needed for double literal
System.out.println("The value of floatNum is: " + floatNum);
System.out.println("The value of doubleNum is: " + doubleNum);
```

### Is 'f' necessary for float?
Yes, the 'f' suffix is necessary when declaring a float literal in Java. This is because, by default, decimal numbers are treated as double literals. If you try to assign a decimal number without the 'f' suffix to a float variable, you will get a compilation error. For example:
```java
float floatNum = 3.14; // This will cause a compilation error
```

### How do you declare a character and a string?
In Java, you can declare a character using the `char` data type and a string using the `String` class. Here’s how you can do it:
```java
char character = 'A'; // Single quotes for char
String string = "Hello, World!"; // Double quotes for String
System.out.println("The character is: " + character);
System.out.println("The string is: " + string);
```

### How do you declare a boolean?
In Java, you can declare a boolean variable using the `boolean` data type. A boolean variable can hold **only** one of two values: `true` or `false`. Here’s how you can declare and initialize a boolean variable:
```java
boolean isJavaFun = true; // Declare and initialize a boolean variable
System.out.println("The boolean value is: " + isJavaFun);
```

### Arithmetic operations in Java

You can perform arithmetic operations in Java using the standard operators: `+`, `-`, `*`, `/`, and `%`. Here’s an example of how to use these operators:

Integral division and floating-point division:
```java
int a = 10;
int b = 3;
int intResult = a / b; // Integer division
double doubleResult = a / (double)b; // Floating-point division
System.out.println("The result of integer division " + a + " / " + b + " is: " + intResult);
System.out.println("The result of double division " + a + ".0 / " + b + ".0 is: " + doubleResult);
```

### Unary operators in Java
Unary operators in Java are used to perform operations on a single operand. The most common unary operators are:
- `+` (unary plus): Indicates a positive value (usually optional).
- `-` (unary minus): Negates the value of the operand.
- `++` (increment): Increases the value of the operand by 1.
- `--` (decrement): Decreases the value of the operand by 1.

Careful with pre-increment and post-increment.

### Relational operators in Java
Relational operators in Java are used to compare two values. The result of a relational operation is always a boolean value (`true` or `false`). The common relational operators are:
- `==` (equal to): Checks if two values are equal.
- `!=` (not equal to): Checks if two values are not equal.
- `>` (greater than): Checks if the left operand is greater than the right operand.
- `<` (less than): Checks if the left operand is less than the right operand.
- `>=` (greater than or equal to):

### Logical operators in Java
Logical operators in Java are used to combine multiple boolean expressions. The common logical operators are:
- `&&` (logical AND): Returns `true` if both operands are true.
- `||` (logical OR): Returns `true` if at least one of the operands is true.
- `!` (logical NOT): Inverts the value of the operand (true becomes false, and false becomes true).

### String in Java is immutable
In Java, strings are immutable, meaning once a string is created, it cannot be changed.
If you try to modify a string, a new string object is created instead. For example:
```java
String userName = "Saurabh Kumar";
System.out.println("Original userName: " + userName);
userName += " Singh"; // This creates a new string object
System.out.println("Updated userName: " + userName);
```

The string object "Saurabh Kumar" itself is not being modified. Instead, here's what actually happens:

- A new string object "Saurabh Kumar Singh" is created in memory
- The variable userName is reassigned to point to this new string object
- The original string object "Saurabh Kumar" remains unchanged in memory (until it's eventually garbage collected)
- The variable userName is mutable (you can reassign it), but the string objects themselves are immutable.

### Main String methods:
Here are some commonly used methods in the `String` class:
- `length()`: Returns the length of the string.
- `charAt(int index)`: Returns the character at the specified index.
- `substring(int beginIndex, int endIndex)`: Returns a substring from the specified range
- `indexOf(String str)`: Returns the index of the first occurrence of the specified substring.
- `toLowerCase()`: Converts the string to lowercase.
- `toUpperCase()`: Converts the string to uppercase.
- `trim()`: Removes leading and trailing whitespace from the string.
- `equals(Object anObject)`: Compares the string to another object for equality.
- `contains(CharSequence sequence)`: Checks if the string contains the specified sequence of characters.
- `replace(CharSequence target, CharSequence replacement)`: Replaces all the occurrences of a specified sequence of characters with another sequence.

### How to take input from the user in Java?
In Java, you can take input from the user using the `Scanner` class. Here’s how you can do it:
```java
import java.util.Scanner;

public class UserInputExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Enter your name: ");
    String userName = scanner.nextLine(); // Read user input
    System.out.println("Hello, " + userName + "!"); // Output the input
    scanner.close(); // Close the scanner to free resources
  }
}
```

### Important scanner methods:
Here are some commonly used methods of the `Scanner` class:
- `nextLine()`: Reads a line of text input from the user.
- `nextInt()`: Reads an integer input from the user.
- `nextDouble()`: Reads a double input from the user.
- `next()`: Reads the next token (word) from the input.
- `nextBoolean()`: Reads a boolean input from the user.


NOTE: Make sure to import the `java.util.Scanner` package at the beginning of your Java file to use the `Scanner` class.

NOTE: Learn about BufferedReader and InputStreamReader later.

### Implicit and explicit type conversion
In Java, type conversion can be implicit or explicit:
- **Implicit Type Conversion (Widening Conversion)**: This occurs when a smaller data type is automatically converted to a larger data type. For example, converting an `int` to a `double`:
```java
int intValue = 10;
double doubleValue = intValue; // Implicit conversion from int to double
System.out.println("Double value: " + doubleValue);
```

- **Explicit Type Conversion (Narrowing Conversion)**: This occurs when a larger data type is converted to a smaller data type. You need to use a cast operator for this conversion. For example, converting a `double` to an `int`:
```java
double doubleValue = 10.5;
int intValue = (int) doubleValue; // Explicit conversion from double to int
System.out.println("Integer value: " + intValue);
```
In this case, the decimal part is truncated during the conversion.

### Constant variables in Java
In Java, you can declare constant variables using the `final` keyword. A constant variable is a variable whose value cannot be changed once it is assigned. Here’s how you can declare a constant variable:
```java
final int MAX_VALUE = 100; // Declare a constant variable
System.out.println("The maximum value is: " + MAX_VALUE);
// MAX_VALUE = 200; // This line would cause a compilation error because MAX_VALUE is a constant
```
The `final` keyword indicates that the variable cannot be reassigned after its initial assignment. If you try to change the value of a `final` variable, you will get a compilation error.

### Arrays in Java
An array in Java is a collection of elements of the **same data type, stored in a contiguous memory location**. You can declare and initialize an array as follows:
```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

System.out.println("The first element is: " + numbers[0]); // Accessing an array element
```

You can also declare and initialize an array in a single line:
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println("The first element is: " + numbers[0]); // Accessing an  array element
``` 

### 2D Arrays in Java
A 2D array in Java is an array of arrays, allowing you to create a matrix-like structure. You can declare and initialize a 2D array as follows:
```java
int[][] matrix = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};
System.out.println("Element at (1, 2): " + matrix[1][2]); // Accessing an element in a 2D array
```

### Careful of String comparisons
When comparing strings in Java, you should use the `equals()` method instead of the `==` operator. The `==` operator checks for reference equality (whether both references point to the same object), while the `equals()` method checks for value equality (whether the contents of the strings are the same). Here’s an example:
```java
String str1 = "A";
String str2 = new String("A");
System.out.println(str1 == str2); // false
System.out.println(str1.equals(str2)); // true
```

### But if i check "A" == "A". Why is this coming as true?

When you write "A" == "A", it returns true because both string literals refer to the same object in the string pool. Java optimizes string literals by storing them in a special area of memory called the **string pool**, and identical string literals share the same memory location.

"A" is a string literal (stored in the string pool)
grade (from scanner.next()) is a new String object created at runtime (not in the string pool)
So grade == "A" compares a new String object with a string literal, which are different objects in memory.


### conditional statements in Java
if, else, else if, switch

### Loops in Java
for, while, do-while

### Exception Handling in Java
In Java, exception handling is done using try-catch blocks. You can catch exceptions that may
occur during the execution of your program and handle them gracefully. Here’s an example:
```java
public class ExceptionHandlingExample {
  public static void main(String[] args) {
    try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
    } catch (Exception e) {
      System.out.println("An exception occurred: " + e.getMessage());
    } finally {
      System.out.println("This block always executes.");
    }
  }
}
```

- try: This block contains code that may throw an exception.
- catch: This block catches the exception and allows you to handle it.
- finally: This block always executes, regardless of whether an exception occurred or not.


## OOPS - Object-Oriented Programming in Java

### What is OOPS?
OOP, is a programming paradigm based on the concept of Classes and Objects, which can contain data and code to manipulate that data.

Class: In Java, a class serves as a blueprint or a template for creating objects. A class encapsulates data for the object and methods to manipulate that data.

Object: An object is an instance of a class. When a class is defined, no memory is allocated or action performed until an object is created from that class. An object is a real-world entity that represents the specific instance of the blueprint (class). It holds actual data in the form of attributes and can perform actions using the methods defined in the class.

### Access specifiers in Java
Access specifiers in Java determine the visibility and accessibility of classes, methods, and variables. The four main access specifiers are:
- `public`: The member is accessible from any other class.
- `private`: The member is accessible only within the class it is declared in.
- `protected`: The member is accessible within the same package and subclasses.
- Default (no specifier): The member is accessible only within the same package. Java assigns a default access level, known as package-private which means the member is accessible only within classes in the same package.

### What is a package in Java?
A package in Java is a namespace that organizes a set of related classes and interfaces. It helps avoid naming conflicts and makes it easier to manage large codebases. Packages can be thought of as folders that contain Java classes. You can create your own packages or use built-in packages provided by Java.

### Static methods:
In Java, a static method belongs to the class rather than to any specific instance of the class. You can call a static method without creating an object of the class. Static methods are often used for utility functions or when you want to **share data across all instances of a class**. Here’s an example:

```java
public class StaticMethodExample {
  public static void displayMessage() {
    System.out.println("This is a static method.");
  }
}
public class Main {
  public static void main(String[] args) {
    StaticMethodExample.displayMessage();
  }
}
```

### Attributes in Java
Attributes in Java are variables that belong to a class. They represent the state or properties of an object. Attributes can have different access specifiers (public, private, protected, or default) to control their visibility. Here’s an example of a class with attributes:
```java
public class Person {
  private String name; // Private attribute
  private int age; // Private attribute

  public Person(String name, int age) {
    this.name = name; // Assigning values to attributes
    this.age = age;
  }
  public void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}
public class Main {
  public static void main(String[] args) {
    Person person = new Person("Saurabh", 25);
    person.displayInfo(); // Calling a method to display information
  }
}
```

### What if we do not specify the access specifier?
If you do not specify an access specifier for a class member (attribute or method), it will have **default access** (also known as package-private). This means that the member is accessible only within classes in the same package. It is not accessible from classes in other packages, even if they are subclasses. Here’s an example:
```java
public class DefaultAccessExample {
  int defaultAttribute; // Default access specifier
  void defaultMethod() { // Default access specifier
    System.out.println("This is a method with default access.");
  }
}

public class Main {
  public static void main(String[] args) {
    DefaultAccessExample example = new DefaultAccessExample();
    example.defaultAttribute = 10; // Accessible within the same package
    example.defaultMethod(); // Accessible within the same package
  }
}
```

### Objects
In Java, an object is an instance of a class. It is created using the `new` keyword followed by the class constructor. Objects can have attributes (variables) and methods (functions) defined in their class. Here’s how you can create and use objects in Java:
```java
public class Car {
  String model;
  int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }
  public void displayInfo() {
    System.out.println("Model: " + model + ", Year: " + year);
  }
}

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Toyota", 2020);
    car1.displayInfo();

    Car car2 = new Car("Honda", 2021);
    car2.displayInfo();
  }
}
```
In this example, we define a `Car` class with attributes `model` and `year`, a constructor to initialize these attributes, and a method `displayInfo()` to print the car's information. In the `Main` class, we create two objects of the `Car` class and call the `displayInfo()` method on each object to display their information.

In a static method, you can only access static attributes and methods of the same class.

### Constructors in Java
A constructor in Java is a special method that is called when an object of a class is created. It is used to initialize the attributes of the object. A constructor has the same name as the class and does not have a return type. Here’s an example:
```java
public class Person {
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
    this.name = name; // 'this' refers to the current object
    this.age = age;
  }

  public void displayInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}
```

### Types of constructors in Java
In Java, there are two types of constructors:
1. **Default Constructor**: A constructor that does not take any parameters. If you do not define any constructor in your class, Java provides a default constructor automatically.
2. **Parameterized Constructor**: A constructor that takes parameters to initialize the attributes of the object. You can define multiple parameterized constructors with different parameter lists (overloading).

```java
public class Rectangle {
  private int length;
  private int width;
  private String color;

  // Default constructor
  public Rectangle() {
    this.length = 1; // Default values
    this.width = 1;
  }

  // Parameterized constructor
  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public Rectangle(int length, int width, int color) {
    this.length = length;
    this.width = width;
  }

  public void displayInfo() {
    System.out.println("Length: " + length + ", Width: " + width);
  }
}
```

What is the default value of attributes if we do not initialize them in the constructor?
If you do not initialize attributes in the constructor, they will have default values based on their data types:
- Numeric types (`int`, `float`, `double`, `long`, `short`, `byte`): Default value is `0`.
- `char`: Default value is `'\u0000'` (null character).
- `boolean`: Default value is `false`.
- Object references: Default value is `null`.

### Pillars of OOPs
The four main pillars of Object-Oriented Programming (OOP) are:
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

## Encapsulation
It refers to the practice of bundling data (variables) and methods (functions) that operate on the data into a single unit, known as a class, and restricting direct access to the data from outside the class.

Key features of encapsulation:
1. **Data Hiding**: You can hide the internal state of an object by declaring its attributes as private access modifiers. This prevents direct access to the attributes from outside the class, ensuring that they can only be accessed or modified through public methods (getters and setters).
2. **Controlled Access**: You can control how the data is accessed or modified by providing public methods (getters and setters) to interact with the private attributes.
3. **Validation and Business Logic**: You can implement validation and business logic in the setter methods to ensure that the data remains consistent and valid.

```java
class BankAccount {
  private int balance;

  public BankAccount() {
    this.balance = 0;
  }

  public BankAccount(int balance, String accountType) {
    this.balance = balance;
  }

  public void setBalance(int balance) {
    // logic to validate and set balance
    this.balance = balance;
  }

  public void getBalance() {
    System.out.println("Balance: " + balance);
  }
}


public class Encapsulation {
  public static void main(String[] args) {
    BankAccount acc = new BankAccount();
    acc.getBalance();

    BankAccount acc2 = new BankAccount(5000, "Current");
    acc2.getBalance();
    acc2.setBalance(6000);
    acc2.getBalance();
  }
}
```

## Inheritance
Inheritance is a core concept that allows a class to inherit properties and behaviors (fields and methods) from another class. It helps in **reusing existing code** (follow the DRY principle) and creating a hierarchical relationship between classes.

In Java, inheritance is achieved using the `extends` keyword. The class that inherits is called the **subclass** (or child class), and the class being inherited from is called the **superclass** (or parent class). The subclass can add its own fields and methods or override the methods of the superclass.

```java
class Vehicle {
  private String vehicleNumber;
  private String vehicleType;

  public Vehicle(String vehicleNumber, String vehicleType) {
    this.vehicleNumber = vehicleNumber;
    this.vehicleType = vehicleType;
  }

  public void getVehicleNumber() {
    System.out.println("Vehicle Number: " + vehicleNumber);
  }
}

class Car extends Vehicle {
  public Car(String carNumber) {
    super(carNumber, "Car");
  }
}

class Main {
  public static void main(String[] args) {
    Car car = new Car("CAR123");
    car.getVehicleNumber();
  }
}
```

### super keyword in Java
The `super` keyword in Java is used to refer to the superclass (parent class) of the current object. It can be used to access superclass methods, constructors, and fields. Here are some common uses of the `super` keyword:

1. **Accessing Superclass Methods**: You can use `super.methodName()` to call a method from the superclass that has been overridden in the subclass.
2. **Accessing Superclass Constructor**: You can use `super()` to call the constructor of the superclass from the subclass constructor.

Note: The `super` keyword must be the first statement in the subclass constructor.

## Polymorphism

Polymorphism is a core concept in OOP that allows objects to be treated as **instances of their parent class or interface**, while having the ability to take on different forms or behaviors. It enables a **single interface** to represent different underlying forms (data types). In Java, polymorphism can be achieved through method overriding and method overloading.

- **Compile-time Polymorphism (Method Overloading)**: The ability to have multiple methods in the same class with the same name but different parameters.

- **Runtime Polymorphism (Method Overriding)**: The ability of a subclass to provide a specific implementation of a method that is already defined in its parent class.

### Runtime Polymorphism
Runtime polymorphism is achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its parent class. When you call a method on an object, the JVM determines which method to execute at runtime based on the actual object type, not the reference type.

```java
class Animal {
  public void sound() {
    System.out.println("Animal makes a sound");
  }
}
class Dog extends Animal {
  @Override
  public void sound() { 
    System.out.println("Dog barks");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    myDog.sound();
  }
}
```

### What is the advantage of runtime polymorphism?
The advantage of runtime polymorphism is that it allows for **dynamic method resolution**, meaning the method that gets executed is determined at runtime based on the actual object type. This enables you to write more flexible and extensible code, as you can use a **common interface or superclass reference** to interact with different subclasses *without knowing their specific types at compile time*. It promotes code reusability and makes it easier to maintain and extend the codebase.


## Abstraction

Derived class cannot extend multiple abstract classes.
Derived class can extend multiple interfaces.

Abstraction is a core concept of Object-Oriented Programming (OOP) in Java that focuses on hiding complex implementation details and exposing only the essential features of an object or method.

Abstraction can be achieved in Java using:
1. Abstract Class
2. Interface

### Abstract Class
An abstract class is a class that **cannot be instantiated directly**. It can have both abstract methods (methods without a body) and regular methods (methods with a body). Abstract methods are **intended to be implemented by subclasses**, ensuring that each subclass provides its own specific implementation of the method.

```java
abstract class Animal {
  abstract void sound();

  void sleep() {
    System.out.println("This animal sleeps.");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog barks.");
  }
}
```

### Interfaces
An interface is a completely abstract type that defines a contract for classes to implement. It contains only abstract methods (prior to Java 8), which must be implemented by any class that "implements" the interface. From Java 8 onwards, interfaces can also contain default and static methods with implementation.

```java
interface Animal {
  void sound();
  void sleep();

  default void eat() {
    System.out.println("This animal eats.");
  }
}

class Dog implements Animal {
  public void sound() {
    System.out.println("Dog barks.");
  }

  public void sleep() {
    System.out.println("Dog sleeps.");
  }
}
```

### What is the difference between an abstract class and an interface?
The main differences between an abstract class and an interface in Java are:

| Feature                | Abstract Class                          | Interface                               |
|------------------------|-----------------------------------------|-----------------------------------------|
| Can have fields        | Yes, can have instance variables        | No, can only have static final variables (constants) |
| Can have methods       | Yes, can have both abstract and concrete methods | Yes, can have only abstract methods (prior to Java 8) or default/static methods (Java 8 onwards) |
| Can have constructors   | Yes, can have constructors | No, cannot have constructors            |
| Multiple inheritance    | No, a class can extend only one abstract class | Yes, a class can implement multiple interfaces |
| Access modifiers       | Can have any access modifier (public, protected, private) | All methods are implicitly public (prior to Java 9) or can have public/private (Java 9 onwards) |
| Use case               | Use when you have a clear "is-a" relationship | Interfaces are used to define a contract that multiple classes can implement, allowing for polymorphism and flexibility. Use when have a "can-do" relationship |

### Can we have diamond problem in Java?
TODO: Check this out later.

## Collections in Java

### TODO: Learn about Wrapper classes in depth

### Custom classes in Java
In Java, you can create custom classes to represent your own data types. A custom class can have attributes (fields) and methods (functions) to define its behavior. Here’s an example of a custom class:
```java
public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

public class Main {
  public static void main(String[] args) {
    Person p = new Person("Alice", 30);
    System.out.println("Name: " + p.getName());
    System.out.println("Age: " + p.getAge());
  }
}
```

### Collections in Java
Java provides a powerful framework for working with collections of objects. The Java Collections Framework (JCF) provides a set of interfaces and classes to handle groups of objects. The main interfaces in the JCF are:
- `Collection`: The root interface for all collections.
- `List`: An ordered collection (also known as a sequence) that allows duplicate elements.
- `Set`: A collection that does not allow duplicate elements.
- `Map`: A collection that maps keys to values, where each key is unique.
- `Queue`: A collection that represents a queue data structure, allowing elements to be processed in a specific order (FIFO).

### List in Java
A `List` is an ordered collection that allows duplicate elements. The most commonly used implementations of the `List` interface are:

### ArrayList
ArrayList is a resizable array implementation of the List interface. It provides fast random access to elements and is suitable for scenarios where you need to frequently access elements by index. It is dynamically resizable, meaning it can grow or shrink as needed.

Useful methods:
- `add(E e)`: Adds the specified element to the end of the list. O(1) time complexity.
- `add(int index, E element)`: Inserts the specified element at the specified position in the list. O(n) time complexity.
- `get(int index)`: Returns the element at the specified position in the list. O(1) time complexity.
- `size()`: Returns the number of elements in the list. O(1) time complexity.
- `isEmpty()`: Checks if the list is empty. O(1) time complexity.
- `remove(int index)`: Removes the element at the specified position in the list and returns it. O(n) time complexity.
- `contains(Object o)`: Checks if the list contains the specified element. O(n) time complexity.

### LinkedList 
LinkedList is a doubly-linked list implementation of the List interface. It provides fast insertion and deletion of elements at both ends of the list, making it suitable for scenarios where you need to frequently add or remove elements from the beginning or end of the list.

Useful methods:
1. add/addLast: Adds an element to the end of the list.
2. addFirst: Adds an element to the beginning of the list.
3. removeFirst: Removes and returns the first element of the list.
4. remove/removeLast: Removes and returns the last element of the list.
5. getFirst: Returns the first element of the list without removing it.
6. getLast: Returns the last element of the list without removing it.
7. size: Returns the number of elements in the list.
8. isEmpty: Checks if the list is empty.


### Stack
Stack is a last-in-first-out (LIFO) data structure that allows you to add and remove elements from the top of the stack. It is implemented using the `Stack` class in Java. 
A stack is useful for scenarios where you need to keep track of the most recently added elements, such as in function call management or undo operations in applications.

### Useful methods:
- `push(E item)`: Pushes an item onto the top of the stack.
- `pop()`: Removes and returns the item at the top of the stack.
- `peek()`: Returns the item at the top of the stack without removing it.
- `isEmpty()`: Checks if the stack is empty.

### Vector
Vector is a resizable array implementation of the List interface, similar to ArrayList. However, Vector is synchronized, meaning it is thread-safe and can be safely used in multi-threaded environments. Vector was part of Java since JDK 1.0, while ArrayList was introduced later in JDK 1.2 as part of the Collections Framework.

### Useful methods:
- `capacity()`: Returns the current capacity of the vector.
- Rest same as ArrayList.

### ArrayList vs Vector: Key Differences

| Feature | ArrayList | Vector |
|---------|-----------|---------|
| **Synchronization** | Not synchronized (not thread-safe) | Synchronized (thread-safe) |
| **Performance** | Faster (no synchronization overhead) | Slower (due to synchronization) |
| **Growth Policy** | Increases by 50% when capacity is exceeded | Doubles in size when capacity is exceeded |
| **Legacy** | Part of Collections Framework (JDK 1.2+) | Legacy class (JDK 1.0+) |
| **Thread Safety** | Requires external synchronization for thread safety | Inherently thread-safe |
| **Memory Usage** | More memory efficient | Less memory efficient (larger growth factor) |
| **Preferred Usage** | Single-threaded applications or when you handle synchronization manually | Multi-threaded applications (though Collections.synchronizedList() is preferred) |

### When to use which?
- **Use ArrayList**: In most cases, especially for single-threaded applications or when you can manage thread safety yourself.
- **Use Vector**: Only when you need a legacy-compatible synchronized list, though `Collections.synchronizedList(new ArrayList<>())` is generally preferred for thread-safe lists.


TODO: Learn about thread safety later.

## Set Interface
A `Set` is a collection that **does not allow duplicate elements**. It is implemented using the `Set` interface in Java. The most commonly used implementations of the `Set` interface are:

### HashSet
HashSet is an implementation of the Set interface that uses a *hash table to store elements*. It provides *constant time* performance for basic operations like add, remove, and contains. However, it *does not* maintain the order of elements. (unordered_set)

### Useful methods:
- `add(E e)`: Adds the specified element to the set if it is not already present.
- `remove(Object o)`: Removes the specified element from the set if it is present.
- `contains(Object o)`: Checks if the set contains the specified element.
- `size()`: Returns the number of elements in the set.
- `isEmpty()`: Checks if the set is empty.

### Aside:
*var keyword* is used to declare a variable without specifying its type explicitly. The compiler infers the type based on the assigned value. It can be used with collections as well, like:
```java
HashSet set = new HashSet<Integer>();
set.add(10);
set.add(20);
set.add(30);

for (var element : set) {
    System.out.println(element);
}
```

### TreeSet
TreeSet is an implementation of the Set interface that uses a *red-black tree* to store unique elements. It maintains the elements in *sorted order* according to their natural ordering or a specified comparator. TreeSet provides *logarithmic time* performance for basic operations like add, remove, and contains. (set)

### Useful methods:
- Similar to HashSet, but elements are stored in sorted order.
- Few important methods:
- `first()`: Returns the first (lowest) element currently in this set.
- `last()`: Returns the last (highest) element currently in this set.
- `floor(E e)`: greatest element in this set *less than or equal to* the given element, or null if there is no such element.
- `ceiling(E e)`: *least element in this set greater than or equal to* the given element, or null if there is no such element.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(30);
treeSet.add(10);
treeSet.add(20);

for (Integer element : treeSet) {
    System.out.println(element); // Output will be in sorted order: 10, 20, 30
}
```

## Queue Interface
A `Queue` is a collection that represents a *first-in-first-out (FIFO)* data structure. It allows you to add elements to the end of the queue and remove elements from the front of the queue. The most commonly used implementations of the Queue interface are:

### ArrayDeque
ArrayDeque is a resizable array implementation of the Deque interface, which allows elements to be added or removed from both ends of the queue. It provides fast access to elements and is suitable for scenarios where you need to frequently add or remove elements from both ends of the queue.

### Useful methods:

To implement a queue using ArrayDeque, you can use the following methods:
```
- offer(E e): Adds the specified element to the end of the queue.
- poll(): Removes and returns the element at the front of the queue.
- peek(): Returns the element at the front of the queue without removing it.
```

To implement a stack using ArrayDeque, you can use the following methods:
```
- offerFirst(E e): Adds the specified element to the front of the stack.
- pollFirst(): Removes and returns the element at the front of the stack.
- peekFirst(): Returns the element at the front of the stack without removing it.
```

### PriorityQueue
PriorityQueue allows you to retrieve the highest-priority element in constant time, while adding and removing elements takes logarithmic time. It is useful for scenarios where you need to process elements based on their priority. By default, it *uses min heap*, meaning the smallest element has the highest priority. You can also provide a custom comparator to change the priority order.

Important methods:
```
- offer(E e)/add(E e)
- poll(): Removes and returns the element with the highest priority (smallest element by default).
- peek(): Returns the element with the highest priority without removing it.
- Iterate using pq.isEmpty() checks and pq.poll() to retrieve elements in priority order.
```

## Map Interface
A `Map` is a collection that maps keys to values, where each key is unique. It allows you to store and retrieve values based on their associated keys. The most commonly used implementations of the Map interface are:

### HashMap
HashMap is an implementation of the Map interface that uses a **hash table to store key-value pairs*. It provides constant time performance for basic operations like put, get, and remove. However, it does not maintain the order of elements.

Important methods:
- `put(K key, V value)`: Adds the specified value with the specified key in the map if not present, or updates the value if the key already exists.
- `get(Object key)`: Returns the value associated with the specified key, or null if the key is not present.
- `remove(Object key)`: Removes the key-value pair associated with the specified key.
- `containsKey(Object key)`: Checks if the map contains the specified key.
- `size()`: Returns the number of key-value pairs in the map.

How to iterate over a HashMap:
```java
HashMap<String, Integer> map = new HashMap<>();
map.put("Alice", 25);
map.put("Bob", 30);
for (Map.Entry<String, Integer> entry : map.entrySet()) {
  System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```

### TreeMap
TreeMap is a red-black tree-based implementation of the Map interface. It stores entries in sorted order based on keys. It provides *logarithmic time performance* for basic operations like put, get, and remove. TreeMap is useful when you need to maintain the order of keys.

Important methods:
- Similar to HashMap, but entries are stored in sorted order based on keys.
- `floorKey(K key)`: Returns the greatest key less than or equal to the given key, or null if there is no such key.
- `ceilingKey(K key)`: Returns the least key greater than or equal to the given key, or null if there is no such key.
- `firstKey()`: Returns the first (lowest) key currently in this map.
- `lastKey()`: Returns the last (highest) key currently in this map.


## Iterator Interface
The `Iterator` interface in Java provides a way to iterate over collections (like List, Set, and Map) without exposing the underlying structure. It allows you to traverse elements in a collection sequentially and provides methods to check for the next element, retrieve the current element, and remove elements during iteration.

Before this, one thing in mind, let's say if you need to declare any class that implements `List` for example, you can do it like this:
```java
List<String> list = new ArrayList<>();
List<String> list2 = new LinkedList<>();
```

This is called **polymorphism**. You can use the `List` interface to refer to any implementation of the List interface, such as ArrayList or LinkedList. This allows you to write code that works with different types of lists without being tied to a specific implementation.

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
  String element = iterator.next();
  System.out.println(element);
}
```

## Common methods on Collections

1. Collections.sort(list, Comparator)
2. Collections.reverse(list)
3. Collections.min(list) / max(list)
4. Collections.frequency(list, element)
5. Math.pow(base, exponent)
6. Math.max(a, b) / min(a, b)

## Custom Comparators
In Java, you can create custom comparators to define the order of elements in collections like List, Set, or Map. A comparator is an interface that defines a method for comparing two objects.
You can implement the `Comparator` interface and override the `compare()` method to specify the comparison logic. Here’s an example of a custom comparator for sorting a list of strings by their length:
```java
import java.util.*;

public class CustomComparatorExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    
    // Custom comparator to sort by length of strings
    Comparator<String> lengthComparator = new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
      }
    };
    
    Collections.sort(names, lengthComparator);
    
    System.out.println("Sorted names by length: " + names);
  }
}
```

This is creating an anonymous class that implements the Comparator<Integer> interface. You're not actually creating an object of the interface directly - you're creating an object of an unnamed class that implements the interface.

1. new Comparator<Integer>() - This looks like you're instantiating an interface, but you're actually declaring a new anonymous class
2. The {...} block - This contains the implementation of the anonymous class
3. @Override public int compare(...) - This implements the required method from the Comparator interface.

It's shorthand for:
```java
// This is what the anonymous class is doing behind the scenes
class MyComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b) {
    return a.compareTo(b);
  }
}

// Then using it like:
Collections.sort(numbers, new MyComparator());
```

How to write the logic?
Check your condition. Now given two numbers a and b, you need to return:
- return -1 if you think a should come before b
- return 1 if you think a should come after b (currently u are in wrong order)
- return 0 if they are equal (no change in order)

Return 1 if you want order changed.

