public class ZigZagLinkedList {

  public Node head;
  public Node tail;
  public int size = 0;

  public static class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
      this.data = data;
      this.next = null;
    }
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

  public void printLL() {
    if (head == null) {
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

  public Node findMid() {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public void reverseLL() {
    Node prev = null;
    Node curr = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public Node firstNode() {
    return head;
  }

  public void reverseHalfLL() {
    Node mid = findMid();
    
    Node curr = mid.next;
    
    mid.next=null;
    
    Node next;
    Node prev = null;
    while (curr!=null) {
      next=curr.next;
      curr.next = prev;
      prev = curr;
      curr=next;
    }

    Node rightHead=prev;
    mid.next = rightHead;
  }

  public void zigzag() {
    Node mid = findMid();
    
    Node curr = mid.next;
    
    mid.next=null;
    
    Node next;
    Node prev = null;
    while (curr!=null) {
      next=curr.next;
      curr.next = prev;
      prev = curr;
      curr=next;
    }

    Node rightHead=prev;
    Node leftHead=head;
    Node nextL, nextR;
    
    while(leftHead!=null && rightHead!=null){
      nextL=leftHead.next;
      nextR=rightHead.next;
      leftHead.next=rightHead;
      rightHead.next=nextL;

      leftHead=nextL;
      rightHead=nextR;
    }
  }

  public static void main(String[] args) {
    ZigZagLinkedList ll = new ZigZagLinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(8);
    ll.addLast(9);
    // ll.addLast(10);
    // ll.addLast(11);
    
    ll.printLL();
    ll.zigzag();
    ll.printLL();
  }
}
