import java.util.*;

public class StackClass {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    st.push(10);
    st.push(20);
    st.push(30);

    System.out.println("Stack after pushing elements: " + st);

    st.pop();
    System.out.println("Stack after popping an element: " + st);

    System.out.println("Top element of the stack: " + st.peek());

    System.out.println("Is the stack empty? " + st.isEmpty());
  } 
}