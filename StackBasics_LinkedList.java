// import java.util.*;

public class StackBasics_LinkedList {
  // LL Node structure
  static class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Stack definition
  static class Stack {
    static Node head = null;

    public boolean isEmpty() {
      return (head == null);
    }

    public void push(int val) {
      Node newNode = new Node(val);
      if (isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public int pop() {
      if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      int val = head.data;
      head = head.next;
      return val;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      return head.data;
    }
  }

  public static void main(String[] args) {
    Stack stk = new Stack();
    stk.push(5);
    stk.push(7);
    stk.push(8);
    stk.pop();
    stk.push(64);
    stk.push(6);
    stk.pop();
    System.out.println(stk.peek());
    stk.push(2);
    System.out.println(stk.peek());
  }
}
