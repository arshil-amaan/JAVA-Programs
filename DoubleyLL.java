public class DoubleyLL {
  public class Node {
    int data;
    Node next;
    Node prev;

    Node() {
    };

    Node(int d) {
      data = d;
      next = null;
      prev = null;
    }

  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.prev = tail;
    tail.next = newNode;
    tail = newNode;
  }

  public int removeFirst() {
    int val;
    if (head == null) {
      System.out.println("Doubly linked list is empty");
      return -1;
    }
    if (head == tail) {
      val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }

  public int removeLast() {
    int val;
    if (head == null) {
      System.out.println("Doubly Linked List is Empty");
      return -1;
    }

    if (head == tail) {
      val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    val = tail.data;
    tail = tail.prev;
    tail.next = null;
    size--;
    return val;
  }

  public void printDLL() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void reverseDLL(){
    Node curr = head;
    Node prev = null;
    Node next;
    while(curr!=null){
      next = curr.next;
      curr.next=prev;
      curr.prev=next;
      prev=curr;
      curr=next;
    }
    head=prev;
  }
  // public void revPrintDLL(){
  //   Node curr = tail;
  //   Node next = null;
  //   Node prev ;

  //   while(curr!=null){
  //     prev=curr.prev;
  //     curr.prev=next;
  //     next=curr;
  //     curr=prev;
  //   }
  //   head=next;
  // }

  public static void main(String[] args) {
    DoubleyLL dll = new DoubleyLL();
    dll.addLast(5);
    dll.addLast(2);
    dll.addLast(3);
    dll.addFirst(4);
    dll.addLast(6);
    dll.addFirst(7);
    dll.addFirst(8);
    dll.addFirst(5);
    System.out.println(size);
    dll.printDLL();
    dll.reverseDLL();
    // dll.addLast(524);
    dll.printDLL();
  }
}
