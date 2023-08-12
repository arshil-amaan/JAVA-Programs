// import java.util.*;

public class LinkedListBasics {
  public static class Node {
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public Node tail;
  public int size;

  public boolean isEmpty() {
    if (head == null) {
      return true;
    }
    return false;
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    // check for empty list
    if (head == null) {
      // so make it the only node in the linkedlist and set both head & tail
      head = tail = newNode;
      size++;
      return;
    }
    newNode.next = head;
    head = newNode;
    size++;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      size++;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    size++;
  }

  public void printLL() {
    if (head==null) {
      System.out.println("Empty Linked List");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add(int index, int data) {

    if (index < 1) {
      addFirst(data);
      return;
    }

    Node ins = new Node(data);
    Node newNode = new Node();

    newNode = head;

    for (int i = 0; i < index - 1; i++) {
      if (newNode.next == null) {
        System.out.println("----------Index Out of Bound----------");
        return;
      }
      newNode = newNode.next;
    }

    ins.next = newNode.next;
    newNode.next = ins;
    size++;
  }

  public int llSize() {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    return size;
  }

  public int removeFirst() {
    if (isEmpty()) {
      System.out.println("Linked List is Empty");
      return -1;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast() {
    if (isEmpty()) {
      System.out.println("Linked List is Empty");
      return -1;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val;
    Node newNode = new Node();
    newNode = head;
    for (int i = 0; i < size - 2; i++) {
      newNode = newNode.next;
    }
    val = newNode.next.data;
    newNode.next = null;
    tail = newNode;
    size--;
    return val;
  }

  public int search(int key) {
    Node temp = head;
    int idx = 0;
    while (temp != null) {
      if (temp.data == key) {
        return idx;
      }
      idx++;
      temp = temp.next;
    }
    return -1;
  }

  public int recursiveSearchHelper(Node lList, int key) {
    if (lList == null) {
      return -1;
    }

    if (lList.data == key) {
      return 0;
    }
    int res = recursiveSearchHelper(lList.next, key);
    if (res == -1) {
      return -1;
    }
    return 1 + res;
  }

  public int recursiveSearch(int key) {
    return recursiveSearchHelper(head, key);
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      // n cn p c n
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public int remNthFromEnd(int targetIdx) {
    if (targetIdx == size - 1) {
      return removeFirst();
    }
    if (targetIdx >= size || targetIdx < 0) {
      System.out.println("----------Invalid Index----------");
      return -1;
    }
    Node temp = head;
    int idx = size - targetIdx - 1;
    for (int i = 0; i < idx; i++) {
      temp = temp.next;
    }
    int val = temp.next.data;
    temp.next = temp.next.next;
    size--;
    // System.out.println(temp.data);
    return val;
  }

  public Node findMid(Node myNode) {
    Node fast = myNode;
    Node slow = myNode;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean checkPalindrome() {
    // if no. of elements is 0/1
    if (head == null || head.next == null) {
      return true;
    }

    // find mid Node
    Node midNode = findMid(head);

    // reverse second half of ll
    Node prev = null;
    Node curr = midNode;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev;
    Node left = head;

    // check whether left half and right half are equal
    while (right != null) {
      if (right.data != left.data) {
        return false;
      }
      right = right.next;
      left = left.next;
    }

    return true;
  }

  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public static void removeCycle() {
    if (isCycle()) {
      Node slow = head;
      Node fast = head;
      Node prev = fast;

      while (slow != fast) {
        slow = slow.next;
        fast = fast.next.next;
      }
      slow = head;
      while (slow != fast) {
        slow = slow.next;
        prev = fast;
        fast = fast.next;
      }
      prev.next = null;
    }
  }

  public static void main(String[] args) {
    // *************************************************
    // head = new Node(1);
    // head.next = new Node(2);
    // Node temp = new Node(5);
    // head.next.next = temp;
    // head.next.next.next = new Node(4);
    // head.next.next.next.next = temp;
    // *************************************************
    LinkedListBasics ll = new LinkedListBasics();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(8);
    ll.printLL();
    // *************************************************
  }
}
