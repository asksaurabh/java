class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class LinkedListBasics {
  static Node convertArrayToLinkedList(int arr[]) {
    Node head = new Node(arr[0]);
    Node current = head;

    for (int i = 1; i < arr.length; i++) {
      current.next = new Node(arr[i]);
      current = current.next;
    }

    return head;
  }

  static void printLinkedList(Node head) {
    Node current = head;

    while(current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }

    System.out.println();
  }

  static Node deleteHead(Node head) {
    if (head == null) return head;

    return head.next;
  }

  static Node deleteTail(Node head) {
    if (head == null || head.next == null) return null;

    Node current = head;
    while(current.next.next != null) {
      current = current.next;
    }

    current.next = null;

    return head;
  }

  static Node deleteAtPosition(Node head, int position) {
    if (head == null) return head;
    if (position == 1) return deleteHead(head);

    int currentPosition = 0;
    Node current = head;
    Node previous = null;

    while(current != null) {
      currentPosition++;

      if (currentPosition == position) {
        previous.next = previous.next.next;
        break;
      }

      previous = current;
      current = current.next;
    }

    return head;
  }

  static Node insertAtHead(Node head, int data) {
    Node newHead = new Node(data);
    newHead.next = head;

    return newHead;
  }

  static Node insertAtTail(Node head, int data) {
    Node newNode = new Node(data);

    if (head == null) return newNode;

    Node current = head;
    while(current.next != null) {
      current = current.next;
    }

    current.next = newNode;
    return head;
  }

  static Node insertAtPosition(Node head, int data, int position) {
    Node newNode = new Node(data);

    if (head == null) return newNode;
    if (position == 1) return insertAtHead(head, data);

    int currentPosition = 0;
    Node current = head;
    Node previous = null;

    while(current != null) {
      currentPosition++;

      if (currentPosition == position) {
        previous.next = newNode;
        newNode.next = current;
        break;
      }

      previous = current;
      current = current.next;
    }

    if (current == null && currentPosition + 1 == position) {
      previous.next = newNode;
    }

    return head;
  }
  
  public static void main(String[] args) {
    int arr[] = {20, 30, 40, 50, 60, 70, 80, 90, 100};

    Node list = convertArrayToLinkedList(arr);
    printLinkedList(list);

    list = deleteHead(list);
    System.out.println("After deleting head");
    printLinkedList(list);

    list = deleteTail(list);
    System.out.println("After deleting tail");
    printLinkedList(list);

    list = deleteAtPosition(list, 3);
    System.out.println("After deleting at position 3");
    printLinkedList(list);

    list = insertAtHead(list, 10);
    System.out.println("After inserting at head");
    printLinkedList(list);

    list = insertAtTail(list, 110);
    System.out.println("After inserting at tail");
    printLinkedList(list);

    list = insertAtPosition(list, 1000, 9);
    System.out.println("After inserting at position 9");
    printLinkedList(list);
  }
}