public class Merge_Sort_Linked_List {
  public class Node {
    int data;
    Node next = null;

    Node() {
    }

    Node(int d) {
      this.data = d;
    }
  }

  public Node head;
  public Node tail;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    // check for empty list
    if (head == null) {
      // so make it the only node in the linkedlist and set both head & tail
      head = tail = newNode;
      // size++;
      return;
    }
    newNode.next = head;
    head = newNode;
    // size++;
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

  private Node findMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }
    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    // divide the list into two halves and sort them recursively
    Node mid = findMid(head);

    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);// sorts first half of linkedlist
    Node newRight = mergeSort(rightHead);// sort second half of linkedlist
    return merge(newLeft, newRight);
  }

  public static void main(String[] args) {
    Merge_Sort_Linked_List ll = new Merge_Sort_Linked_List();
    ll.addFirst(2);
    // ll.addFirst(5);
    ll.addFirst(1);
    ll.addFirst(9);
    ll.addFirst(3);

    ll.printLL();
    ll.head = ll.mergeSort(ll.head);
    ll.printLL();

  }
}
